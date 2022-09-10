package zerobase.weather.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import zerobase.weather.domain.Diary;

import java.time.LocalDate;
import java.util.List;


@Repository
public interface DiaryRepository extends JpaRepository<Diary, Integer>  {

    //다이어리 조회
    List<Diary> findAllByDate(LocalDate date);

    //다이어리 조회 2
    List<Diary> findAllByDateBetween(LocalDate startDate, LocalDate endDate);

    Diary getFirstByDate(LocalDate date);


    @Transactional
    void deleteAllByDate(LocalDate date);




}
