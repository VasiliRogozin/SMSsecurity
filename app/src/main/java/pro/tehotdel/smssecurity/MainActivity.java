package pro.tehotdel.smssecurity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    //атрибуты
    // final String ATRIBUTE_NAME_ID = "id";
    final String ATTRIBUTE_NAME_NAMB = "name";
    final String ATRIBUTE_NAME_TEXT = "text";
    final String ATRIBUTE_NAME_IMAGE = "image";
    //
    ListView IvSimple;
    GridView grid;

    // массивы данных
    //String[] id = new String[] {"1", "2", "3", "4"};
    String[] namb = new String[] {"901", "902", "903", "904","12341", "12342", "12343", "12344","12341", "12342", "12343", "12344","12341", "12342", "12343", "12344","12341", "12342", "12343", "12344","12341", "12342", "12343", "12344","12341", "12342", "12343", "12344","12341", "12342", "12343", "12344","901", "902", "903", "904","12341", "12342", "12343", "12344","12341", "12342", "12343", "12344","12341", "12342", "12343", "12344","12341", "12342", "12343", "12344","12341", "12342", "12343", "12344","12341", "12342", "12343", "12344","12341", "12342", "12343", "12344","12341", "12342", "12343", "12344","12341", "12342", "12343", "12344"};
    String[] text = new String[] {"901", "902", "903", "904","12341", "12342", "12343", "12344","12341", "12342", "12343", "12344","12341", "12342", "12343", "12344","12341", "12342", "12343", "12344","12341", "12342", "12343", "12344","12341", "12342", "12343", "12344","12341", "12342", "12343", "12344","901", "902", "903", "904","12341", "12342", "12343", "12344","12341", "12342", "12343", "12344","12341", "12342", "12343", "12344","12341", "12342", "12343", "12344","12341", "12342", "12343", "12344","12341", "12342", "12343", "12344","12341", "12342", "12343", "12344","12341", "12342", "12343", "12344","12341", "12342", "12343", "12344"};
    String[] image = new String[] {"901", "902", "903", "904","12341", "12342", "12343", "12344","12341", "12342", "12343", "12344","12341", "12342", "12343", "12344","12341", "12342", "12343", "12344","12341", "12342", "12343", "12344","12341", "12342", "12343", "12344","12341", "12342", "12343", "12344","901", "902", "903", "904","12341", "12342", "12343", "12344","12341", "12342", "12343", "12344","12341", "12342", "12343", "12344","12341", "12342", "12343", "12344","12341", "12342", "12343", "12344","12341", "12342", "12343", "12344","12341", "12342", "12343", "12344","12341", "12342", "12343", "12344","12341", "12342", "12343", "12344"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // adjustGridView();

        //упаковка данных (48)
        ArrayList<Map<String, Object>> data = new ArrayList<Map<String, Object>>(namb.length);
        Map<String, Object> m;
        for (int i = 0; i < namb.length; i ++ ){
            m = new HashMap<String, Object>();
            // m.put(ATRIBUTE_NAME_ID, id[i]);
            m.put(ATTRIBUTE_NAME_NAMB, namb[i]);
            m.put(ATRIBUTE_NAME_TEXT, text[i]);
            m.put(ATRIBUTE_NAME_IMAGE, image[i]);
            data.add(m);
        }
        //массив атрибутов
        String[] from = {ATTRIBUTE_NAME_NAMB, ATRIBUTE_NAME_TEXT,ATRIBUTE_NAME_IMAGE};

        //массив id компонентов куда будут вставлены данные
        int[] to = {R.id.namb, R.id.text, R.id.image};

        //адабтер
        SimpleAdapter sAdap = new SimpleAdapter(this, data, R.layout.btn_item, from, to);

        // список и присвоение адаптера + параметры града(через метод тварь крашиться)(57)
        GridView grid = (GridView) findViewById(R.id.list);
        grid.setAdapter(sAdap);
        grid.setNumColumns(GridView.AUTO_FIT);
        grid.setColumnWidth(400);
        grid.setVerticalSpacing(30);
        grid.setHorizontalSpacing(30);
        grid.setStretchMode(GridView.STRETCH_SPACING_UNIFORM);


    }



}