package example.hp.ebudgetting;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "pemasukan")
public class Pemasukan {
    @PrimaryKey(autoGenerate = false)
    @NonNull
    @ColumnInfo(name = "pemasukan_nomor")
    private String mNomor;
    @ColumnInfo(name = "pemasukan_tanggal")
    private String mTanggal;
    @ColumnInfo(name = "pemasukan_jumlah")
    private String mJumlah;
    @ColumnInfo(name = "pemasukan_sumber")
    private String mSumber;

    public Pemasukan(String nomor, String tanggal, String jumlah, String sumber) {
        this.mNomor = nomor;
        this.mTanggal = tanggal;
        this.mJumlah = jumlah;
        this.mSumber = sumber;
    }

    public String getNomor() {
        return mNomor;
    }

    public String getTanggal() {
        return mTanggal;
    }

    public String getJumlah() {
        return mJumlah;
    }

    public String getSumber() {
        return mSumber;
    }
}
