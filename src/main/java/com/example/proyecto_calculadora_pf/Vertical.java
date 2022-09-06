package com.example.proyecto_calculadora_pf;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Vertical extends Fragment{
    @Nullable
    TextView screen;                    //Entradas y respuestas.
    TextView operation;                 //Operacion.
    TextView ans;                       //Respuesta guardada.
    boolean noche_dia = false;
    Double Total = 0.0;
    Double Aux = 0.0;
    Double Ans = 0.0;
    Short Operacion = 0;
    String Num = "";
    String NumAux = "";
    View ViewEX;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,@Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.vertical_a, container, false);
        ViewEX = view;

        screen = (TextView) view.findViewById(R.id.Pantalla);
        operation = (TextView) view.findViewById(R.id.Operacion);
        ans = (TextView) view.findViewById(R.id.Respuesta);

        ButtonHandler bh = new ButtonHandler();

        view.findViewById(R.id.btnCircle).setOnClickListener(bh);
        view.findViewById(R.id.btnCircle2).setOnClickListener(bh);
        view.findViewById(R.id.btnCircle3).setOnClickListener(bh);
        view.findViewById(R.id.btnCircle4).setOnClickListener(bh);
        view.findViewById(R.id.btnCircle5).setOnClickListener(bh);
        view.findViewById(R.id.btnCircle6).setOnClickListener(bh);
        view.findViewById(R.id.btnCircle7).setOnClickListener(bh);
        view.findViewById(R.id.btnCircle8).setOnClickListener(bh);
        view.findViewById(R.id.btnCircle9).setOnClickListener(bh);
        view.findViewById(R.id.btnCircle0).setOnClickListener(bh);

        view.findViewById(R.id.btnCirclePunto).setOnClickListener(bh);
        view.findViewById(R.id.btnCircleMas).setOnClickListener(bh);
        view.findViewById(R.id.btnCircleMasMenos).setOnClickListener(bh);
        view.findViewById(R.id.btnCircleMenos).setOnClickListener(bh);
        view.findViewById(R.id.btnCirclePor).setOnClickListener(bh);
        view.findViewById(R.id.btnCircleDiv).setOnClickListener(bh);

        view.findViewById(R.id.btnCircleEq).setOnClickListener(bh);
        view.findViewById(R.id.btnCircleAC).setOnClickListener(bh);
        view.findViewById(R.id.btnCircleDEL).setOnClickListener(bh);
        view.findViewById(R.id.btnCircleAns).setOnClickListener(bh);

        view.findViewById(R.id.btnCircleDiaNoche).setOnClickListener(bh);
        return view;
    }

    private class ButtonHandler  implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                //-------------------------------------Numeros--------------------------------------
                case R.id.btnCircle:
                    Num = Num + "1";
                    screen.setText(String.valueOf(Num));
                    break;
                case R.id.btnCircle2:
                    Num = Num + "2";
                    screen.setText(String.valueOf(Num));
                    break;
                case R.id.btnCircle3:
                    Num = Num + "3";
                    screen.setText(String.valueOf(Num));
                    break;
                case R.id.btnCircle4:
                    Num = Num + "4";
                    screen.setText(String.valueOf(Num));
                    break;
                case R.id.btnCircle5:
                    Num = Num + "5";
                    screen.setText(String.valueOf(Num));
                    break;
                case R.id.btnCircle6:
                    Num = Num + "6";
                    screen.setText(String.valueOf(Num));
                    break;
                case R.id.btnCircle7:
                    Num = Num + "7";
                    screen.setText(String.valueOf(Num));
                    break;
                case R.id.btnCircle8:
                    Num = Num + "8";
                    screen.setText(String.valueOf(Num));
                    break;
                case R.id.btnCircle9:
                    Num = Num + "9";
                    screen.setText(String.valueOf(Num));
                    break;
                case R.id.btnCircle0:
                    Num = Num + "0";
                    screen.setText(String.valueOf(Num));
                    break;
                case R.id.btnCirclePunto:
                    Num = Num + ".";
                    screen.setText(String.valueOf(Num));
                    break;
                case R.id.btnCircleAns:
                    Num = ans.getText().toString();
                    //resAn.setText(String.valueOf("0"));
                    screen.setText(String.valueOf(Num));
                    break;
                //-------------------------------------Borrado--------------------------------------
                case R.id.btnCircleAC:
                    screen.setText(String.valueOf("0"));
                    operation.setText(String.valueOf("0"));
                    ans.setText(String.valueOf("0"));
                    Total = 0.0;
                    Operacion = 0;
                    Ans = 0.0;
                    Aux = 0.0;
                    Num = "";
                    NumAux = "";
                    break;
                case R.id.btnCircleDEL:
                    screen.setText(String.valueOf("0"));
                    Num = "";
                    break;
                //-------------------------------------Operaciones----------------------------------
                case R.id.btnCircleMas:
                    Num = eval_no_cero(Num);
                    NumAux = Num;
                    Num = "";
                    Operacion = 1;
                    operation.setText(String.valueOf(NumAux) + "+");
                    screen.setText(String.valueOf("0"));
                    break;
                case R.id.btnCircleMenos:
                    Num = eval_no_cero(Num);
                    NumAux = Num;
                    Num = "";
                    Operacion = 2;
                    operation.setText(String.valueOf(NumAux) + "-");
                    screen.setText(String.valueOf("0"));
                    break;
                case R.id.btnCirclePor:
                    Num = eval_no_cero(Num);
                    NumAux = Num;
                    Num = "";
                    Operacion = 3;
                    operation.setText(String.valueOf(NumAux) + "x");
                    screen.setText(String.valueOf("0"));
                    break;
                case R.id.btnCircleDiv:
                    Num = eval_no_cero(Num);
                    NumAux = Num;
                    Num = "";
                    Operacion = 4;
                    operation.setText(String.valueOf(NumAux) + "/");
                    screen.setText(String.valueOf("0"));
                    break;
                case R.id.btnCircleMasMenos:
                    Num = eval_no_cero(Num);
                    Total = Double.parseDouble(Num) * -1;
                    if(Total%1 != 0) {
                        screen.setText(String.valueOf(Total));
                        Num = Double.toString(Total);
                    }
                    else{
                        String Punto = (String.valueOf(Total));
                        String[] parts = Punto.split("\\."); // String array, each element is text between dots
                        screen.setText(parts[0]);
                        Num = parts[0];
                    }
                    break;
                //-------------------------------Resultado------------------------------------------
                case R.id.btnCircleEq:
                    Num = eval_no_cero(Num);
                    if(Operacion == 1){
                        operation.setText(String.valueOf(NumAux) + "+" + String.valueOf(Num));
                        Ans = Double.parseDouble(Num) + Double.parseDouble(NumAux);
                        eval_punto(Ans);
                    }else{
                        if(Operacion == 2){
                            operation.setText(String.valueOf(NumAux) + "-" + String.valueOf(Num));
                            Ans = Double.parseDouble(NumAux) - Double.parseDouble(Num);
                            eval_punto(Ans);
                        }
                        else{
                            if(Operacion == 3){
                                operation.setText(String.valueOf(NumAux) + "x" + String.valueOf(Num));
                                Ans = Double.parseDouble(Num) * Double.parseDouble(NumAux);
                                eval_punto(Ans);
                            }
                            else{
                                if(Operacion == 4){
                                    if(Float.parseFloat(NumAux) == 0 || Float.parseFloat(Num) == 0){
                                        operation.setText(String.valueOf(NumAux) + "/" + String.valueOf(Num));
                                        screen.setText("Syntax Error");
                                    }
                                    else {
                                        operation.setText(String.valueOf(NumAux) + "/" + String.valueOf(Num));
                                        Ans = Double.parseDouble(NumAux) / Double.parseDouble(Num);
                                        eval_punto(Ans);
                                    }
                                }
                            }
                        }
                    }
                    break;
                //--------------------------------Extras--------------------------------------------
                case R.id.btnCircleDiaNoche:
                    if(noche_dia == false) {
                        ViewEX.getRootView().setBackgroundColor(Color.BLACK);
                        screen.setTextColor(Color.WHITE);
                        operation.setTextColor(Color.WHITE);
                        ans.setTextColor(Color.WHITE);
                        noche_dia  = true;
                        view.setBackgroundDrawable(getResources().getDrawable(R.drawable.night_chan));
                    }
                    else{
                        ViewEX.getRootView().setBackgroundColor(Color.WHITE);
                        screen.setTextColor(Color.BLACK);
                        operation.setTextColor(Color.BLACK);
                        ans.setTextColor(Color.BLACK);
                        noche_dia  = false;
                        view.setBackgroundDrawable(getResources().getDrawable(R.drawable.day_chan));
                    }
                    break;
            }
        }
    }
    public static double eval(final String str) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
                return x;
            }

            // Grammar:
            // expression = term | expression `+` term | expression `-` term
            // term = factor | term `*` factor | term `/` factor
            // factor = `+` factor | `-` factor | `(` expression `)`
            //        | number | functionName factor | factor `^` factor

            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if      (eat('+')) x += parseTerm(); // addition
                    else if (eat('-')) x -= parseTerm(); // subtraction
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if      (eat('*')) x *= parseFactor(); // multiplication
                    else if (eat('/')) x /= parseFactor(); // division
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return parseFactor(); // unary plus
                if (eat('-')) return -parseFactor(); // unary minus

                double x;
                int startPos = this.pos;
                if (eat('(')) { // parentheses
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') { // functions
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    if (func.equals("sqrt")) x = Math.sqrt(x);
                    else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                    else throw new RuntimeException("Unknown function: " + func);
                } else {
                    throw new RuntimeException("Unexpected: " + (char)ch);
                }

                if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation

                return x;
            }
        }.parse();
    }
    public void eval_punto(double now){
        float f = (float)now;
        if(f%1 != 0) {
            screen.setText(String.valueOf(f));
            ans.setText(String.valueOf(f));
            Num = Float.toString(f);
        }
        else{
            String Punto = (String.valueOf(f));
            String[] parts = Punto.split("\\."); // String array, each element is text between dots
            screen.setText(parts[0]);
            ans.setText(parts[0]);
            Num = parts[0];
        }
    }
    public String eval_no_cero(String now){
        if(now == ""){
            now = "0";
        }
        return now;
    }
}
