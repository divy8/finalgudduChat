package divy.guddu;

import android.app.LauncherActivity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Acer-PC on 22-11-2017.
 */

public class Fetcher extends RecyclerView.Adapter<Fetcher.ViewHolder> {
    private List<Chat> chat;
   private Context context;


    public Fetcher(List<Chat> lists, Context context) {
        this.chat = lists;
      this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        int layoutIdForListItem = R.layout.chat_list;
        LayoutInflater inflater = LayoutInflater.from(context);

        View view = inflater.inflate(layoutIdForListItem, parent , false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;

       /** View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.chat_list, parent, false);*/
              /*  return new ViewHolder(viewHolder);*/

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

                Chat chats=chat.get(position);
               holder.chatList.setText(chats.getChat());


    }

    @Override
    public int getItemCount() {
        return chat.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView chatList;

        public ViewHolder(View itemView) {
            super(itemView);

            chatList =(TextView) itemView.findViewById(R.id.textsView);
        }
    }
}
