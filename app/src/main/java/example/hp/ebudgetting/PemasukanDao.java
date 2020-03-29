package example.hp.ebudgetting;

import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

@Dao
public interface PemasukanDao {
    @Query("Select * from pemasukan")
    LiveData<List<Pemasukan>> getPemasukanList();
    @Insert
    void insertPemasukan(Pemasukan mpemasukan);
    @Update
    void updatePemasukan(Pemasukan mpemasukan);
    @Delete
    void deletePemasukan(Pemasukan mpemasukan);
    @Query("Delete From pemasukan")
    void deleteAllPemasukan();
}
