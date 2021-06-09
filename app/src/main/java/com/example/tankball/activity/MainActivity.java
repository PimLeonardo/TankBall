package com.example.tankball.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.tankball.R;
import com.example.tankball.adapter.DraftAdapter;
import com.example.tankball.model.Draft;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ImageView sair;
    List<Draft> listadraft = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        recyclerView = findViewById(R.id.mock_draft_recycle);
        CriarLista();

        DraftAdapter draftAdapter = new DraftAdapter(listadraft, getApplicationContext());

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(draftAdapter);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));

        sair = findViewById(R.id.sair);
        sair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, TelaPerfil.class);
                startActivity(intent);
            }
        });
    }

    public void CriarLista(){

        listadraft.add(new Draft("Cade Cunningham","PG","Oklahoma State","19 Anos","20.5 PTS","6.3 REB","3.5 AST","0.8 BLK","1.6 STL","220 lbs","6'7","https://a.espncdn.com/i/teamlogos/nba/500/hou.png"));
        listadraft.add(new Draft("Evan Mobley","C","USC","19 Anos","17.4 PTS","9.2 REB","2.5 AST","3.1 BLK","0.8 STL","215 lbs","7'0","https://a.espncdn.com/i/teamlogos/nba/500/det.png"));
        listadraft.add(new Draft("Jalen Suggs","PG/SG","Gonzaga","19 Anos","17.9 PTS","6.6 REB","5.6 AST","0.4 BLK","2.4 STL","205 lbs","6'4","https://a.espncdn.com/i/teamlogos/nba/500/orl.png"));
        listadraft.add(new Draft("Jalen Green","SG","G League","19 Anos","20.2 PTS","4.6 REB","3.2 AST","0.3 BLK","1.7 STL","178 lbs","6'6","https://a.espncdn.com/i/teamlogos/nba/500/okc.png"));
        listadraft.add(new Draft("Jonathan Kuminga","SF","G League","18 Anos","17.4 PTS","7.9 REB","3.0 AST","0.9 BLK","1.1 STL","210 lbs","6'8","https://a.espncdn.com/i/teamlogos/nba/500/cle.png"));
        listadraft.add(new Draft("Scottie Barnes","PF","Florida State","19 Anos","15.0 PTS","5.8 REB","5.9 AST","0.7 BLK","2.1 STL","227 lbs","6'9","https://a.espncdn.com/i/teamlogos/nba/500/gs.png"));
        listadraft.add(new Draft("Jalen Johnson","SF/PF","Duke","19 Anos","18.9 PTS","10.2 REB","3.8 AST","2.1 BLK","1.9 STL","220 lbs","6'9","https://a.espncdn.com/i/teamlogos/nba/500/tor.png"));
        listadraft.add(new Draft("Keon Johnson","SG","Tennessee","19 Anos","16.0 PTS","5.0 REB","3.5 AST","0.6 BLK","1.6 STL","186 lbs","6'5","https://a.espncdn.com/i/teamlogos/nba/500/orl.png"));
        listadraft.add(new Draft("Corey Kispert","SF","Gonzaga","22 Anos","21.0 PTS","5.6 REB","2.0 AST","0.5 BLK","1.0 STL","220 lbs","6'7","https://a.espncdn.com/i/teamlogos/nba/500/sac.png"));
        listadraft.add(new Draft("Davion Mitchell","PG/SG","Baylor","22 Anos","15.3 PTS","2.9 REB","6.0 AST","0.4 BLK","2.1 STL","205 lbs","6'2","https://a.espncdn.com/i/teamlogos/nba/500/no.png"));
        listadraft.add(new Draft("Alperen Şengün","C","Beşiktaş","18 Anos","24.3 PTS","11.2 REB","3.5 AST","2.0 BLK","1.7 STL","240 lbs","6'10","https://a.espncdn.com/i/teamlogos/nba/500/cha.png"));
        listadraft.add(new Draft("Moses Moody","SG","Arkansas","19 Anos","17.9 PTS","6.1 REB","1.7 AST","0.7 BLK","1.1 STL","205 lbs","6'6","https://a.espncdn.com/i/teamlogos/nba/500/sa.png"));
        listadraft.add(new Draft("James Bouknight","SG","UConn","20 Anos","21.3 PTS","6.4 REB","2.0 AST","0.3 BLK","1.3 STL","190 lbs","6'5","https://a.espncdn.com/i/teamlogos/nba/500/ind.png"));
        listadraft.add(new Draft("Franz Wagner","SF","Michigan","19 Anos","14.2 PTS","7.4 REB","3.4 AST","1.2 BLK","1.4 STL","205 lbs","6'8","https://a.espncdn.com/i/teamlogos/nba/500/gs.png"));
        listadraft.add(new Draft("Josh Giddey","PG","Adelaide","18 Anos","12.1 PTS","8.3 REB","8.3 AST","0.5 BLK","1.2 STL","205 lbs","6'8","https://a.espncdn.com/i/teamlogos/nba/500/wsh.png"));
        listadraft.add(new Draft("Isaiah Jackson","PF/C","Kentucky","19 Anos","14.6 PTS","11.4 REB","1.2 AST","4.5 BLK","1.3 STL","206 lbs","6'10","https://a.espncdn.com/i/teamlogos/nba/500/bos.png"));
        listadraft.add(new Draft("Ziaire Williams","SF","Stanford","19 Anos","13.8 PTS","5.9 REB","2.8 AST","0.7 BLK","1.1 STL","185 lbs","6'8","https://a.espncdn.com/i/teamlogos/nba/500/mem.png"));
        listadraft.add(new Draft("Usman Garuba","PF","Real Madrid","19 Anos","9.5 PTS","9.6 REB","1.9 AST","1.1 BLK","1.4 STL","229 lbs","6'8","https://a.espncdn.com/i/teamlogos/nba/500/okc.png"));
        listadraft.add(new Draft("Jared Butler","PG","Baylor","21 Anos","19.9 PTS","3.9 REB","5.7 AST","0.4 BLK","2.3 STL","190 lbs","6'3","https://a.espncdn.com/i/teamlogos/nba/500/ny.png"));
        listadraft.add(new Draft("Chris Duarte","SG","Oregon","23 Anos","18.1 PTS","4.9 REB","2.8 AST","0.9 BLK","2.0 STL","190 lbs","6'6","https://a.espncdn.com/i/teamlogos/nba/500/atl.png"));
        listadraft.add(new Draft("Kai Jones","PF/C","Texas","20 Anos","13.9 PTS","7.6 REB","1.0 AST","1.5 BLK","1.3 STL","218 lbs","6'11","https://a.espncdn.com/i/teamlogos/nba/500/ny.png"));
        listadraft.add(new Draft("Jaden Springer","PG/SG","Tennessee","18 Anos","17.4 PTS","4.9 REB","4.1 AST","0.6 BLK","1.7 STL","204 lbs","6'4","https://a.espncdn.com/i/teamlogos/nba/500/lal.png"));
        listadraft.add(new Draft("Day'Ron Sharpe","C","North Carolina","19 Anos","17.8 PTS","14.2 REB","2.7 AST","1.7 BLK","1.5 STL","265 lbs","6'11","https://a.espncdn.com/i/teamlogos/nba/500/hou.png"));
        listadraft.add(new Draft("Greg Brown","PF","Texas","19 Anos","16.4 PTS","10.8 REB","0.7 AST","1.7 BLK","1.0 STL","205 lbs","6'9","https://a.espncdn.com/i/teamlogos/nba/500/hou.png"));
        listadraft.add(new Draft("Sharife Cooper","PG","Auburn","20 Anos","21.9 PTS","4.6 REB","8.8 AST","0.3 BLK","1.1 STL","180 lbs","6'1","https://a.espncdn.com/i/teamlogos/nba/500/lac.png"));
        listadraft.add(new Draft("Filip Petrušev","PF/C","Mega Bemax","21 Anos","26.5 PTS","9.0 REB","1.9 AST","1.3 BLK","0.5 STL","225 lbs","6'11","https://a.espncdn.com/i/teamlogos/nba/500/den.png"));
        listadraft.add(new Draft("Neemias Queta","C","Utah State","21 Anos","17.9 PTS","12.2 REB","3.2 AST","4.0 BLK","1.3 STL","226 lbs","7'0","https://a.espncdn.com/i/teamlogos/nba/500/bkn.png"));
        listadraft.add(new Draft("Josh Christopher","SG","Arizona State","19 Anos","17.3 PTS","5.7 REB","1.7 AST","0.6 BLK","1.8 STL","215 lbs","6'5","https://a.espncdn.com/i/teamlogos/nba/500/phi.png"));
        listadraft.add(new Draft("Ayo Dosunmu","PG/SG","Illinois","21 Anos","20.6 PTS","6.5 REB","5.4 AST","0.2 BLK","1.1 STL","185 lbs","6'5","https://a.espncdn.com/i/teamlogos/nba/500/phx.png"));
        listadraft.add(new Draft("Trey Murphy III","SF/SG","Virginia","21 Anos","13.7 PTS","4.1 REB","1.5 AST","0.5 BLK","1.0 STL","206 lbs","6'9","https://a.espncdn.com/i/teamlogos/nba/500/utah.png"));
        listadraft.add(new Draft("Tre Mann","PG","Florida","20 Anos","17.8 PTS","6.3 REB","3.8 AST","0.1 BLK","1.5 STL","190 lbs","6'5","https://a.espncdn.com/i/teamlogos/nba/500/mil.png"));
        listadraft.add(new Draft("Cameron Thomas","SG","LSU","19 Anos","24.4 PTS","3.6 REB","1.5 AST","0.2 BLK","0.9 STL","210 lbs","6'4","https://a.espncdn.com/i/teamlogos/nba/500/ny.png"));
        listadraft.add(new Draft("Matthew Hurt","PF","Duke","21 Anos","20.2 PTS","6.8 REB","1.6 AST","0.8 BLK","0.8 STL","214 lbs","6'8","https://a.espncdn.com/i/teamlogos/nba/500/orl.png"));
        listadraft.add(new Draft("BJ Boston","SG","Kentucky","19 Anos","13.6 PTS","5.3 REB","1.9 AST","0.2 BLK","1.6 STL","185 lbs","6'6","https://a.espncdn.com/i/teamlogos/nba/500/no.png"));
        listadraft.add(new Draft("Joel Ayayi","PG/SG","Gonzaga","21 Anos","13.9 PTS","7.9 REB","3.1 AST","0.2 BLK","1.3 STL","180 lbs","6'5","https://a.espncdn.com/i/teamlogos/nba/500/okc.png"));
        listadraft.add(new Draft("Terrence Shannon Jr.","SG","Texas Tech","20 Anos","17.3 PTS","5.3 REB","1.9 AST","0.2 BLK","1.5 STL","210 lbs","6'6","https://a.espncdn.com/i/teamlogos/nba/500/okc.png"));
        listadraft.add(new Draft("Daishen Nix","PG","G League","19 Anos","11.9 PTS","7.2 REB","7.2 AST","0.3 BLK","1.4 STL","224 lbs","6'5","https://a.espncdn.com/i/teamlogos/nba/500/det.png"));
        listadraft.add(new Draft("Rokas Jokubaitis","PG","Žalgiris","20 Anos","13.6 PTS","2.9 REB","5.9 AST","0.0 BLK","1.2 STL","194 lbs","6'4","https://a.espncdn.com/i/teamlogos/nba/500/no.png"));
        listadraft.add(new Draft("Ariel Hukporti","C","BC Nevėžis","19 Anos","16.0 PTS","11.3 REB","2.1 AST","1.9 BLK","1.4 STL","251 lbs","7'0","https://a.espncdn.com/i/teamlogos/nba/500/sac.png"));
        listadraft.add(new Draft("Johnny Juzang","SG","UCLA","20 Anos","17.8 PTS","4.6 REB","1.8 AST","0.4 BLK","0.9 STL","210 lbs","6'6","https://a.espncdn.com/i/teamlogos/nba/500/chi.png"));
        listadraft.add(new Draft("Jay Huff","PF/C","Virginia","22 Anos","17.3 PTS","9.4 REB","1.3 AST","3.5 BLK","0.7 STL","240 lbs","7'1","https://a.espncdn.com/i/teamlogos/nba/500/sa.png"));
        listadraft.add(new Draft("Nah'Shon Hyland","SG","VCU","20 Anos","21.9 PTS","5.3 REB","2.3 AST","0.2 BLK","2.1 STL","173 lbs","6'3","https://a.espncdn.com/i/teamlogos/nba/500/det.png"));
        listadraft.add(new Draft("Miles McBride","PG","West Virginia","20 Anos","16.7 PTS","4.1 REB","5.1 AST","0.3 BLK","2.0 STL","200 lbs","6'2","https://a.espncdn.com/i/teamlogos/nba/500/no.png"));
        listadraft.add(new Draft("Scottie Lewis","SG/SF","Florida","21 Anos","11.0 PTS","4.3 REB","2.1 AST","1.5 BLK","2.2 STL","185 lbs","6'5","https://a.espncdn.com/i/teamlogos/nba/500/bkn.png"));
        listadraft.add(new Draft("Herbert Jones","SF","Alabama","22 Anos","14.8 PTS","8.7 REB","4.3 AST","1.5 BLK","2.3 STL","210 lbs","6'8","https://a.espncdn.com/i/teamlogos/nba/500/bos.png"));
        listadraft.add(new Draft("Max Abmas","PG","Oral Roberts","20 Anos","23.9 PTS","3.1 REB","3.7 AST","0.2 BLK","1.4 STL","165 lbs","6'1","https://a.espncdn.com/i/teamlogos/nba/500/tor.png"));
        listadraft.add(new Draft("Roko Prkačin","PF","Cibona","18 Anos","17.6 PTS","9.7 REB","2.6 AST","0.7 BLK","1.4 STL","210 lbs","6'9","https://a.espncdn.com/i/teamlogos/nba/500/tor.png"));
        listadraft.add(new Draft("Joe Wieskamp","SF","Iowa","21 Anos","18.3 PTS","8.2 REB","2.1 AST","0.4 BLK","1.2 STL","212 lbs","6'6","https://a.espncdn.com/i/teamlogos/nba/500/atl.png"));
        listadraft.add(new Draft("McKinley Wright IV","PG","Colorado","22 Anos","16.8 PTS","4.8 REB","6.3 AST","0.3 BLK","1.2 STL","196 lbs","6'0","https://a.espncdn.com/i/teamlogos/nba/500/bkn.png"));
        listadraft.add(new Draft("Isaiah Livers","SF","Michigan","22 Anos","14.9 PTS","6.8 REB","2.3 AST","0.8 BLK","0.6 STL","230 lbs","6'7","https://a.espncdn.com/i/teamlogos/nba/500/phi.png"));
        listadraft.add(new Draft("Quentin Grimes","SG","Houston","21 Anos","19.6 PTS","6.3 REB","2.2 AST","0.3 BLK","1.5 STL","210 lbs","6'5","https://a.espncdn.com/i/teamlogos/nba/500/mem.png"));
        listadraft.add(new Draft("Juhann Bégarin","SG","Paris Basketball","18 Anos","15.4 PTS","4.8 REB","3.8 AST","0.7 BLK","1.8 STL","185 lbs","6'5","https://a.espncdn.com/i/teamlogos/nba/500/det.png"));
        listadraft.add(new Draft("David Johnson","PG","Louisville","20 Anos","13.0 PTS","5.9 REB","3.2 AST","0.3 BLK","1.1 STL","210 lbs","6'5","https://a.espncdn.com/i/teamlogos/nba/500/no.png"));
        listadraft.add(new Draft("Luka Garza","C","Iowa","22 Anos","27.6 PTS","10.0 REB","2.0 AST","1.8 BLK","0.8 STL","265 lbs","6'11","https://a.espncdn.com/i/teamlogos/nba/500/ind.png"));
        listadraft.add(new Draft("Austin Reaves","SG","Oklahoma","23 Anos","19.1 PTS","5.7 REB","4.8 AST","0.3 BLK","1.0 STL","206 lbs","6'5","https://a.espncdn.com/i/teamlogos/nba/500/okc.png"));
        listadraft.add(new Draft("Jeremiah Robinson-Earl","PF","Villanova","20 Anos","16.4 PTS","8.9 REB","2.3 AST","0.7 BLK","1.0 STL","230 lbs","6'9","https://a.espncdn.com/i/teamlogos/nba/500/cha.png"));
        listadraft.add(new Draft("Ochai Agbaji","SG","Kansas","21 Anos","15.1 PTS","3.9 REB","2.0 AST","0.5 BLK","1.2 STL","210 lbs","6'5","https://a.espncdn.com/i/teamlogos/nba/500/cha.png"));
        listadraft.add(new Draft("Charles Bassey","C","Western Kentucky","20 Anos","20.9 PTS","13.7 REB","0.8 AST","3.7 BLK","0.5 STL","239 lbs","6'10","https://a.espncdn.com/i/teamlogos/nba/500/ny.png"));
        listadraft.add(new Draft("Isaiah Todd","PF","G League","19 Anos","18.2 PTS","7.2 REB","1.2 AST","1.1 BLK","0.7 STL","210 lbs","6'10","https://a.espncdn.com/i/teamlogos/nba/500/bkn.png"));
        listadraft.add(new Draft("Oscar da Silva","PF","Stanford","22 Anos","20.7 PTS","7.5 REB","2.7 AST","1.2 BLK","1.0 STL","230 lbs","6'9","https://a.espncdn.com/i/teamlogos/nba/500/ind.png"));
    }
}