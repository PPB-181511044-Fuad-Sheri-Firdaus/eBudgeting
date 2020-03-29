package example.hp.ebudgetting;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;

public class PemasukanAdapter extends RecyclerView.Adapter<PemasukanAdapter.ViewHolder> {

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView pemasukanNomor;
        public TextView pemasukanTanggal;
        public TextView pemasukanJumlah;
        public TextView pemasukanSumber;

        public ViewHolder(View itemView) {
            super((itemView));

            pemasukanNomor = (TextView) itemView.findViewById(R.id.nomorp);
            pemasukanTanggal = (TextView) itemView.findViewById(R.id.tanggalp);
            pemasukanNomor = (TextView) itemView.findViewById(R.id.nomorp);
            pemasukanSumber = (TextView) itemView.findViewById(R.id.sumberp);
        }
    }

    private List<Pemasukan> mPemasukan;

    void setPemasukan(List<Pemasukan> pemasukan) {
        mPemasukan = pemasukan;
        notifyDataSetChanged();
    }

    public PemasukanAdapter(List<Pemasukan> pemasukans) {
        mPemasukan = pemasukans;
    }

    @NonNull
    @Override
    public PemasukanAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View pemasukanView = inflater.inflate(R.layout.item, parent, false);

        ViewHolder viewHolder = new ViewHolder(pemasukanView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PemasukanAdapter.ViewHolder viewHolder, final int position) {
        Pemasukan pemasukans = mPemasukan.get(position);

        TextView pemasukanNomor = viewHolder.pemasukanNomor;
        pemasukanNomor.setText(pemasukans.getNomor());

        TextView pemasukanTanggal = viewHolder.pemasukanTanggal;
        pemasukanTanggal.setText(pemasukans.getTanggal());

        TextView pemasukanJumlah = viewHolder.pemasukanJumlah;
        pemasukanJumlah.setText(pemasukans.getJumlah());

        TextView pemasukanSumber = viewHolder.pemasukanSumber;
        pemasukanSumber.setText(pemasukans.getSumber());
    }

    public Pemasukan getPemasukanAtPosition (int position) { return mPemasukan.get(position);}

    @Override
    public int getItemCount() {
        return mPemasukan.size();
    }
}
