package com.example.iowner.eva1_11_otra_listas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Principal extends AppCompatActivity implements ListView.OnItemClickListener {
    ListView lstVwTitu;
    TextView txtVwMuestra;
    final String[] strTitulos = {"Azteca","Otono Azteca","El viajero","Halcon","Lentejuelas"};
    final String[] strMuestras = {"Deseamos informarnos de las riquezas, de las creencias y ritos " +
            "y ceremonias que tuvieron en tiempos ya pasados, los naturales habitantes en esa " +
            "tierra de la Nueva España. Es nuestra voluntad ser instruidos en todas estas materias " +
            "concernientes a la existencia de los indios en esa tierra antes de la llegada de " +
            "nuestras fuerzas libertadoras, evangelistas; de nuestros embajadores y colonizadores. " +
            "Por lo tanto, es nuestra voluntad que seáis informado en persona, por indios " +
            "ancianos (a quienes debéis hacer jurar para que lo que digan sea verdadero y " +
            "no falso) de todo lo concerniente a la historia de su tierra, sus gobernantes, " +
            "sus tradiciones, sus costumbres, etcétera. Añadiendo a esa información la que " +
            "aporten testigos, escritos, tablillos u otros registros de esos tiempos ya idos, " +
            "que puedan verificar lo que se dice, y enviad a vuestros frailes a que busquen " +
            "e indaguen sobre esos escritos entre los indios.","Aquel lejano día en que contemplé " +
            "como prendían fuego a un hombre yo tenía dieciocho años, de manera que ya había visto " +
            "morir a otras personas, ya fuera ofrecidas a los dioses en sacrificio, ejecutadas " +
            "por algún crimen atroz o, simplemente, muertos de forma accidental. Pero los " +
            "sacrificios siempre se habían llevado a cabo por medio del cuchillo de " +
            "obsidiana que arranca el corazón. Las ejecuciones siempre se habían realizado " +
            "con la espada maquáhuitl, con flechas o con la guirnalda de flores que " +
            "estrangula. Los muertos de forma accidental eran en su mayoría pescadores " +
            "de nuestra ciudad, una ciudad situada al lado del océano, que de algún " +
            "modo habían caído en desgracia de la diosa del agua y se habían ahogado.","Estando " +
            "Marco Polo en su lecho de muerte, se reunieron a su alrededor su capellán, sus amigos\n" +
            "y parientes, suplicándole que renunciara finalmente a las incontables mentiras que había hecho\n" +
            "pasar por aventuras reales, para que así su alma subiera al cielo purificada. El anciano se\n" +
            "incorporó, los maldijo a todos rotundamente y declaró: «No he contado ni la mitad de lo que\n" +
            "hice ni de lo que vi.»","He dividido el relato de Thorn —páginas y más páginas de " +
            "hechos sin solución de continuidad y sin espaciar— en secciones y capítulos a mi " +
            "buen criterio. Para facilitar la lectura he recurrido en ocasiones a la letra " +
            "bastardilla para dar énfasis al texto, establecer párrafos y dotarlo de una cierta " +
            "puntuación, recursos que en los manuscritos de la épo¬ca se utilizan raras veces, " +
            "si no de forma arbitraria. Me he tomado, además, una libertad digna de mención: en " +
            "numero¬sos párrafos en que Thorn emplea el vocablo latino barbarus o su equivalente " +
            "gótico gasts, lo he transcrito por «extranje¬ro». En la época de Thorn, prácticamente " +
            "todas las naciones, tribus y clanes denominaban «bárbaros» a los demás, pero el " +
            "epíteto —salvo cuando se empleaba como auténtico insulto— no poseía la " +
            "connotación actual de bruto y salvaje; por eso he juzgado que «extranjero» define " +
            "mejor el sentido que se le daba","—Yo diría que no veremos más al elefante, " +
            "¿eh, Johnny? —dijo uno de los soldados de uniforme azul.\n" +
            "—Supongo que no, Billy —respondió uno de los soldados de uniforme gris. " +
            "Entonces pareció un poco sorprendido—: iEh! ¿Vosotros, los yanquis, también " +
            "decís lo mismo sobre el elefante?\n" +
            "—Siempre, o solíamos decirlo —respondió el soldado de la Unión—. Si un tipo" +
            " decía que iba a ver al elefante, significaba que su tropa salía a luchar con " +
            "vosotros, los rebeldes.\n" +
            "—Claro, y lo mismo pasaba con nosotros, los confederados. Siento haber " +
            "perdido esta guerra, pero no siento haber dejado de ver para siempre a ese elefante en particular.\n"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        lstVwTitu = findViewById(R.id.listViewTitu);
        txtVwMuestra = findViewById(R.id.txtVwMuestra);
        lstVwTitu.setOnItemClickListener(this);
        lstVwTitu.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,strTitulos));

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        txtVwMuestra.setText(strMuestras[i]);
    }
}
