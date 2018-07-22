package bbct.android.common.database;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface BaseballCardDao {
    @Insert
    long insertBaseballCard(BaseballCard card);

    @Insert
    long[] insertBaseballCards(List<BaseballCard> cards);

    @Update
    int updateBaseballCard(BaseballCard card);

    @Update
    int updateBaseballCards(List<BaseballCard> cards);

    @Query("SELECT * FROM baseball_cards")
    List<BaseballCard> getBaseballCards();

    @Query("SELECT * FROM baseball_cards WHERE id = :id")
    BaseballCard getBaseballCard(int id);
}
