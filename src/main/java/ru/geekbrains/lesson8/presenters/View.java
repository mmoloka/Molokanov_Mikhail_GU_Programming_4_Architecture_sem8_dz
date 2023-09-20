package ru.geekbrains.lesson8.presenters;

import ru.geekbrains.lesson8.models.Table;

import java.util.Collection;
import java.util.Date;

public interface View {

    /**
     * Отображение списка столиков в приложении
     *
     * @param tables список столиков
     */
    void showTables(Collection<Table> tables);

    /**
     * Отобразить результат бронирования столика
     *
     * @param reservationNo номер брони
     */
    void showReservationTableResult(int reservationNo);

    /**
     * Отобразить результат изменения бронирования столика
     *
     * @param newReservationNo номер новой брони
     */
    void showChangeReservation(int newReservationNo);


    /**
     * Установить наблюдателя для представления
     *
     * @param observer наблюдатель
     */
    void setObserver(ViewObserver observer);

    /**
     * Событие: Клиент нажал на кнопку резерва столика
     *
     * @param orderDate дата резерва
     * @param tableNo   номер столика
     * @param name      Имя клиента
     */
    void reservationTable(Date orderDate, int tableNo, String name);

    /**
     * Событие: Клиент нажал на кнопку изменения резерва
     *
     * @param oldReservation  идентификатор бронирования (старый)
     * @param reservationDate дата бронирования
     * @param tableNo         номер столика
     * @param name            Имя
     */
    void changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name);

}
