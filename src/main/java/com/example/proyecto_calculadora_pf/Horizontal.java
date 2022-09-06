package com.example.proyecto_calculadora_pf;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Horizontal extends Fragment{
    @Nullable
    View ViewEX;
    TextView screen;                    //Entradas y respuestas.
    TextView operation;                 //Operacion.
    TextView ans;                       //Respuesta guardada.
    boolean noche_dia = false;
    boolean paren = false;
    boolean deg_rad = false;
    Double Total = 0.0;
    Double Aux = 0.0;
    Double Ans = 0.0;
    Double Situ = 0.0;
    Double Ansi = 0.0;
    Short Operacion = 0;
    String Num = "";
    String NumAux = "";
    String Paren = "";
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,@Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.horizontal_a, container, false);
        ViewEX = view;
        screen = (TextView) view.findViewById(R.id.Pantalla);
        operation = (TextView) view.findViewById(R.id.Operacion);
        ans = (TextView) view.findViewById(R.id.Respuesta);

        Horizontal.ButtonHandler bh  = new Horizontal.ButtonHandler();

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

        view.findViewById(R.id.btnCircleSin).setOnClickListener(bh);
        view.findViewById(R.id.btnCircleCos).setOnClickListener(bh);
        view.findViewById(R.id.btnCircleTan).setOnClickListener(bh);
        view.findViewById(R.id.btnCircleSinh).setOnClickListener(bh);
        view.findViewById(R.id.btnCircleCosh).setOnClickListener(bh);
        view.findViewById(R.id.btnCircleTanh).setOnClickListener(bh);

        view.findViewById(R.id.btnCirclePot2).setOnClickListener(bh);
        view.findViewById(R.id.btnCirclePot3).setOnClickListener(bh);
        view.findViewById(R.id.btnCirclePoty).setOnClickListener(bh);

        view.findViewById(R.id.btnCircleRaiz2).setOnClickListener(bh);
        view.findViewById(R.id.btnCircleRaiz3).setOnClickListener(bh);
        view.findViewById(R.id.btnCircleRaizy).setOnClickListener(bh);

        view.findViewById(R.id.btnCircleLn).setOnClickListener(bh);
        view.findViewById(R.id.btnCircleLog).setOnClickListener(bh);
        view.findViewById(R.id.btnCirclePot10).setOnClickListener(bh);
        view.findViewById(R.id.btnCirclePI).setOnClickListener(bh);

        view.findViewById(R.id.btnCircleParIzq).setOnClickListener(bh);
        view.findViewById(R.id.btnCircleParDer).setOnClickListener(bh);
        view.findViewById(R.id.btnCircleDeg).setOnClickListener(bh);
        view.findViewById(R.id.btnCircleRad).setOnClickListener(bh);

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
                    Paren = Paren + "1";
                    screen.setText(String.valueOf(Num));
                    break;
                case R.id.btnCircle2:
                    Num = Num + "2";
                    Paren = Paren + "2";
                    screen.setText(String.valueOf(Num));
                    break;
                case R.id.btnCircle3:
                    Num = Num + "3";
                    Paren = Paren + "3";
                    screen.setText(String.valueOf(Num));
                    break;
                case R.id.btnCircle4:
                    Num = Num + "4";
                    Paren = Paren + "4";
                    screen.setText(String.valueOf(Num));
                    break;
                case R.id.btnCircle5:
                    Num = Num + "5";
                    Paren = Paren + "5";
                    screen.setText(String.valueOf(Num));
                    break;
                case R.id.btnCircle6:
                    Num = Num + "6";
                    Paren = Paren + "6";
                    screen.setText(String.valueOf(Num));
                    break;
                case R.id.btnCircle7:
                    Num = Num + "7";
                    Paren = Paren + "7";
                    screen.setText(String.valueOf(Num));
                    break;
                case R.id.btnCircle8:
                    Num = Num + "8";
                    Paren = Paren + "8";
                    screen.setText(String.valueOf(Num));
                    break;
                case R.id.btnCircle9:
                    Num = Num + "9";
                    Paren = Paren + "9";
                    screen.setText(String.valueOf(Num));
                    break;
                case R.id.btnCircle0:
                    Num = Num + "0";
                    Paren = Paren + "0";
                    screen.setText(String.valueOf(Num));
                    break;
                case R.id.btnCirclePunto:
                    Num = Num + ".";
                    Paren = Paren + ".";
                    screen.setText(String.valueOf(Num));
                    break;
                case R.id.btnCircleAns:
                    Num = ans.getText().toString();
                    Paren = Paren + ans.getText().toString();
                    //ans.setText(String.valueOf("0"));
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
                    paren = false;
                    Paren = "";
                    break;
                case R.id.btnCircleDEL:
                    screen.setText(String.valueOf("0"));
                    if(Operacion != 0)
                        Paren = DelString(Paren);
                    else{
                        Paren = "";
                        Num = "";
                    }
                    break;
                //-------------------------------------Operaciones----------------------------------
                case R.id.btnCircleMas:
                    Num = eval_no_cero(Num);
                    NumAux = Num;
                    Num = "";
                    Operacion = 1;
                    Paren = Paren + "+";
                    operation.setText(Paren);
                    screen.setText(String.valueOf("0"));
                    break;
                case R.id.btnCircleMenos:
                    Num = eval_no_cero(Num);
                    NumAux = Num;
                    Num = "";
                    Operacion = 2;
                    Paren = Paren + "-";
                    operation.setText(Paren);
                    screen.setText(String.valueOf("0"));
                    break;
                case R.id.btnCirclePor:
                    Num = eval_no_cero(Num);
                    NumAux = Num;
                    Num = "";
                    Operacion = 3;
                    Paren = Paren + "*";
                    operation.setText(Paren);
                    screen.setText(String.valueOf("0"));
                    break;
                case R.id.btnCircleDiv:
                    Num = eval_no_cero(Num);
                    NumAux = Num;
                    Num = "";
                    Operacion = 4;
                    Paren = Paren + "/";
                    operation.setText(Paren);
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
                case R.id.btnCircleEq:
                    if(Num == ""){
                        Paren = Paren + "0";
                    }
                    operation.setText(String.valueOf( Paren ));
                    Ansi = eval(Paren);
                    eval_punto(Ansi);
                    break;
                //-------------------------------Parentesis-----------------------------------------
                case R.id.btnCircleParDer:
                    Paren = Paren + ")";
                    screen.setText(String.valueOf("0"));
                    paren = true;
                    operation.setText(String.valueOf(Paren));
                    break;
                case R.id.btnCircleParIzq:
                    Paren = Paren + "(";
                    screen.setText(String.valueOf("0"));
                    paren = true;
                    operation.setText(String.valueOf(Paren));
                    break;
                //----------------------------Trigonometricas---------------------------------------
                case R.id.btnCircleSin:
                    Num = eval_no_cero(Num);
                    operation.setText("sin(" + String.valueOf(Num)+")");
                    Situ = Double.parseDouble(Num);
                    if(deg_rad == false)
                    Ansi = Math.sin(Situ);
                    else{
                        Ansi = Math.sin(Math.toDegrees(Situ));
                    }
                    screen.setText(String.valueOf(Ansi));
                    if((String.valueOf(Ansi)).length() > 3){
                        ans.setText((String.valueOf(Ansi)).substring(0,6));
                    }
                    else
                        eval_punto(Ansi);
                    //Num = Double.toString(Ansi);
                    break;
                case R.id.btnCircleCos:
                    Num = eval_no_cero(Num);
                    operation.setText("cos(" + String.valueOf(Num)+")");
                    Situ = Double.parseDouble(Num);
                    if(deg_rad == false)
                        Ansi = Math.cos(Situ);
                    else{
                        Ansi = Math.cos(Math.toDegrees(Situ));
                    }
                    screen.setText(String.valueOf(Ansi));
                    if((String.valueOf(Ansi)).length() > 3){
                        ans.setText((String.valueOf(Ansi)).substring(0,6));
                    }
                    else
                        eval_punto(Ansi);
                    //Num = Double.toString(Ansi);
                    break;
                case R.id.btnCircleTan:
                    Num = eval_no_cero(Num);
                    operation.setText("tan(" + String.valueOf(Num)+")");
                    Situ = Double.parseDouble(Num);
                    if(deg_rad == false)
                        Ansi = Math.tan(Situ);
                    else{
                        Ansi = Math.tan(Math.toDegrees(Situ));
                    }
                    screen.setText(String.valueOf(Ansi));
                    if((String.valueOf(Ansi)).length() > 3){
                        ans.setText((String.valueOf(Ansi)).substring(0,6));
                    }
                    else
                        eval_punto(Ansi);
                    //Num = Double.toString(Ansi);
                    break;
                case R.id.btnCircleSinh:
                    Num = eval_no_cero(Num);
                    operation.setText("sinh(" + String.valueOf(Num)+")");
                    Situ = Double.parseDouble(Num);
                    if(deg_rad == false)
                        Ansi = Math.sinh(Situ);
                    else{
                        Ansi = Math.sinh(Math.toDegrees(Situ));
                    }
                    screen.setText(String.valueOf(Ansi));
                    if((String.valueOf(Ansi)).length() > 3){
                        ans.setText((String.valueOf(Ansi)).substring(0,6));
                    }
                    else
                        eval_punto(Ansi);
                    //Num = Double.toString(Ansi);
                    break;
                case R.id.btnCircleCosh:
                    Num = eval_no_cero(Num);
                    operation.setText("cosh(" + String.valueOf(Num)+")");
                    Situ = Double.parseDouble(Num);
                    if(deg_rad == false)
                        Ansi = Math.cosh(Situ);
                    else{
                        Ansi = Math.cosh(Math.toDegrees(Situ));
                    }
                    screen.setText(String.valueOf(Ansi));
                    if((String.valueOf(Ansi)).length() > 3){
                        ans.setText((String.valueOf(Ansi)).substring(0,6));
                    }
                    else
                        eval_punto(Ansi);
                    //Num = Double.toString(Ansi);
                    break;
                case R.id.btnCircleTanh:
                    Num = eval_no_cero(Num);
                    operation.setText("tanh(" + String.valueOf(Num)+")");
                    Situ = Double.parseDouble(Num);
                    if(deg_rad == false)
                        Ansi = Math.tanh(Situ);
                    else{
                        Ansi = Math.tanh(Math.toDegrees(Situ));
                    }
                    screen.setText(String.valueOf(Ansi));
                    if((String.valueOf(Ansi)).length() > 3){
                        ans.setText((String.valueOf(Ansi)).substring(0,6));
                    }
                    else
                        eval_punto(Ansi);
                    //Num = Double.toString(Ansi);
                    break;
                //-------------------------------Potencias------------------------------------------
                case R.id.btnCirclePot2:
                    Num = eval_no_cero(Num);
                    operation.setText(String.valueOf(Num) + "^2");
                    Situ = Double.parseDouble(Num);
                    Ansi =  Math.pow(Situ,2);
                    eval_punto(Ansi);
                    break;
                case R.id.btnCirclePot3:
                    Num = eval_no_cero(Num);
                    operation.setText(String.valueOf(Num) + "^3");
                    Situ = Double.parseDouble(Num);
                    Ansi =  Math.pow(Situ,3);
                    eval_punto(Ansi);
                    break;
                case R.id.btnCirclePoty:
                    Num = eval_no_cero(Num);
                    NumAux = Num;
                    Num = "";
                    Operacion = 5;
                    operation.setText(String.valueOf(NumAux) + "^");
                    Paren = Paren + "^";
                    screen.setText(String.valueOf("0"));
                    break;
                case R.id.btnCirclePot10:
                    Num = eval_no_cero(Num);
                    operation.setText("10^"+String.valueOf(Num));
                    Situ = Double.parseDouble(Num);
                    Paren = "10^" + Paren;
                    break;
                //---------------------------------Raices-------------------------------------------
                case R.id.btnCircleRaiz2:
                    Num = eval_no_cero(Num);
                    operation.setText("2√" + String.valueOf(Num));
                    Situ = Double.parseDouble(Num);
                    Ansi = Math.pow(Situ,1.0/2.0);
                    eval_punto(Ansi);
                    break;
                case R.id.btnCircleRaiz3:
                    Num = eval_no_cero(Num);
                    operation.setText("3√" + String.valueOf(Num));
                    Situ = Double.parseDouble(Num);
                    Ansi = Math.pow(Situ,1.0/3.0);
                    eval_punto(Ansi);
                    break;
                case R.id.btnCircleRaizy:
                    Num = eval_no_cero(Num);
                    NumAux = Num;
                    Num = "";
                    Operacion = 6;
                    Paren = Paren + "√";
                    operation.setText(Paren);
                    screen.setText(String.valueOf("0"));
                    break;
                //-------------------------------Logaritmos-----------------------------------------
                case R.id.btnCircleLn:
                    Num = eval_no_cero(Num);
                    operation.setText("Ln(" + String.valueOf(Num)+")");
                    Situ = Double.parseDouble(Num);
                    Ansi = Math.log(Situ);
                    screen.setText(String.valueOf(Ansi));
                    ans.setText(  (String.valueOf(Ansi)).substring(0, 6)  );
                    Num = Double.toString(Ansi);
                    break;
                case R.id.btnCircleLog:
                    Num = eval_no_cero(Num);
                    operation.setText("Log10(" + String.valueOf(Num)+")");
                    Situ = Double.parseDouble(Num);
                    Ansi = Math.log10(Situ);
                    screen.setText(String.valueOf(Ansi));
                    ans.setText(  (String.valueOf(Ansi)).substring(0, 6)  );
                    Num = Double.toString(Ansi);
                    break;
                //-------------------------------Rad-y-Deg------------------------------------------
                case R.id.btnCirclePI:
                    Num = "3.141592653589793";
                    screen.setText(String.valueOf(Num));
                    Paren = Paren + Num;
                    break;
                case R.id.btnCircleDeg:
                    deg_rad = true;
                    view.setBackgroundDrawable(getResources().getDrawable(R.drawable.btn_grey));
                    ViewEX.findViewById(R.id.btnCircleRad).setBackgroundDrawable(getResources().getDrawable(R.drawable.btn_darkgrey));
                    break;
                case R.id.btnCircleRad:
                    view.setBackgroundDrawable(getResources().getDrawable(R.drawable.btn_grey));
                    ViewEX.findViewById(R.id.btnCircleDeg).setBackgroundDrawable(getResources().getDrawable(R.drawable.btn_darkgrey));
                    deg_rad = false;
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

    //Evaluador con parentesis y prioridad.
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
                    if (func.equals("√")) x = Math.sqrt(x);
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
    public String eval_no_cero(String nows){
        if(nows == ""){
            nows = "0";
        }
        return nows;
    }
    public String DelString(String str){
        int n = str.length()-1;
        boolean corto = false;
        if(str.charAt(n) >= '0' && str.charAt(n) <= '9') {
            while (str.charAt(n) >= '0' && str.charAt(n) <= '9') {
                n--;
            }
            corto = true;
        }
        if(corto == true) {
            return (String.valueOf(str)).substring(0, n+1);
        }
        else
            return str;
    }
}
