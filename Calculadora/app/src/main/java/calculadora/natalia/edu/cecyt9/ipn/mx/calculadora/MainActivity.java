package calculadora.natalia.edu.cecyt9.ipn.mx.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve,cero,igual,clear,suma,resta,multi,div,cuadrado,porcentaje,raiz;
    private TextView resultado, control;
    private final char SUMA = '+';
    private final char RESTA = '-';
    private final char MULTI = '*';
    private final char DIV = '/';
    private final String CUADRADO = "^2";
    private final char PORCENTAJE = '%';
    private final char RAIZ = '√';
    private double valor1 = Double.NaN;
    private double valor2 = Double.NaN;
    private char ACCION;
    private final char IGUAL = '0';


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vistas();

        cero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                control.setText(control.getText().toString() + "0");
            }
        });

        uno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                control.setText(control.getText().toString() + "1");
            }
        });
        dos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                control.setText(control.getText().toString() + "2");
            }
        });
        tres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                control.setText(control.getText().toString() + "3");
            }
        });
        cuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                control.setText(control.getText().toString() + "4");
            }
        });
        cinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                control.setText(control.getText().toString() + "5");
            }
        });
        seis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                control.setText(control.getText().toString() + "6");
            }
        });
        siete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                control.setText(control.getText().toString() + "7");
            }
        });
        ocho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                control.setText(control.getText().toString() + "8");
            }
        });
        nueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                control.setText(control.getText().toString() + "9");
            }
        });

        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                computar();
                ACCION = SUMA;
                resultado.setText(String.valueOf(valor1) + "+");
                control.setText(null);
            }
        });

        resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                computar();
                ACCION = RESTA;
                resultado.setText(String.valueOf(valor1) + "-");
                control.setText(null);
            }
        });

        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                computar();
                ACCION = MULTI;
                resultado.setText(String.valueOf(valor1) + "*");
                control.setText(null);
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                computar();
                ACCION = DIV;
                resultado.setText(String.valueOf(valor1) + "/");
                control.setText(null);
            }
        });

        igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                computar();
                ACCION = IGUAL;
                resultado.setText(resultado.getText().toString() + String.valueOf(valor2)+ "=" + String.valueOf(valor1));
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(control.getText().length() > 0){
                    CharSequence nombre = control.getText().toString();
                    control.setText(nombre.subSequence(0,nombre.length()-1));

                }
                else{
                    valor1 = Double.NaN;
                    valor2 = Double.NaN;
                    control.setText(null);
                    resultado.setText(null);
                }
            }
        });

    }

    private void vistas(){
        uno = (Button) findViewById(R.id.btn1);
        dos = (Button) findViewById(R.id.btn2);
        tres = (Button) findViewById(R.id.btn3);
        cuatro = (Button) findViewById(R.id.btn4);
        cinco = (Button) findViewById(R.id.btn5);
        seis = (Button) findViewById(R.id.btn6);
        siete = (Button) findViewById(R.id.btn7);
        ocho = (Button) findViewById(R.id.btn8);
        nueve = (Button) findViewById(R.id.btn9);
        cero = (Button) findViewById(R.id.btn0);
        igual = (Button) findViewById(R.id.igual);
        clear = (Button) findViewById(R.id.clear);
        suma = (Button) findViewById(R.id.suma);
        resta = (Button) findViewById(R.id.resta);
        multi = (Button) findViewById(R.id.multi);
        div = (Button) findViewById(R.id.division);
        cuadrado = (Button) findViewById(R.id.cuadrado);
        porcentaje = (Button) findViewById(R.id.porcentaje);
        raiz = (Button) findViewById(R.id.raiz);
        control = (TextView) findViewById(R.id.control);
        resultado = (TextView) findViewById(R.id.resultado);
    }

    private void computar(){
        if(!Double.isNaN(valor1)){
            valor2 = Double.parseDouble(control.getText().toString());

            switch(ACCION){
                case SUMA:
                    valor1 = valor1 + valor2;
                    break;
                case RESTA:
                    valor1 = valor1 - valor2;
                    break;
                case MULTI:
                    valor1 = valor1 + valor2;
                    break;
                case DIV:
                    valor1 = valor1 / valor2;
                    break;
                case IGUAL:
                    break;

            }
        }
        else{
            valor1 = Double.parseDouble(control.getText().toString());
        }
    }
}
