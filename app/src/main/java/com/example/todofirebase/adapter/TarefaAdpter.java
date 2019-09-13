package com.example.todofirebase.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.todofirebase.R;
import com.example.todofirebase.modelo.Tarefa;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class TarefaAdpter extends ArrayAdapter<Tarefa> {

    private Context context;
    private List<Tarefa> tarefas;

    public TarefaAdpter(Context context, ArrayList<Tarefa> tarefas){

        super(context,0,tarefas);

        this.context = context;
        this.tarefas = tarefas;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        View listaItem = convertView;

        //Inicializando o layout_list na ListView
        if (listaItem == null){
            listaItem = LayoutInflater.from(context).inflate(R.layout.layout_list,parent,false);
        }

        Tarefa tarefaAtual = tarefas.get(position);

        TextView nomeTarefa = listaItem.findViewById(R.id.text_view_nome_tarefa);
        nomeTarefa.setText(tarefaAtual.getNome());

        TextView statusTarefa = listaItem.findViewById(R.id.text_view_status_tarefa);
        statusTarefa.setText(tarefaAtual.getStatus().toString());

        ImageView imagemTarefa = listaItem.findViewById(R.id.image_view_tarefa);
        Picasso.get()
                .load(tarefaAtual.getImageSrc())
                .resize(70,70)
                .centerCrop()
                .into(imagemTarefa);



        if(tarefaAtual.getStatus() == true){

            TextView concluir = listaItem.findViewById(R.id.text_view_status_tarefa);
            concluir.setText("Concluída ");
            concluir.setTextColor(context.getResources().getColor(R.color.Terminar));

        }

        else {

            TextView concluir = listaItem.findViewById(R.id.text_view_status_tarefa);
            concluir.setText("Não Concluída");
            concluir.setTextColor(context.getResources().getColor(R.color.Falta));

        }





        return listaItem;
    }
}
