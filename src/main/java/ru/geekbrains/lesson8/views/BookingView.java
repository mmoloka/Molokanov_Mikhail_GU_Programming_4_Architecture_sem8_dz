package ru.geekbrains.lesson8.views;

import ru.geekbrains.lesson8.models.Table;
import ru.geekbrains.lesson8.presenters.View;
import ru.geekbrains.lesson8.presenters.ViewObserver;

import java.util.Collection;
import java.util.Date;

public class BookingView implements View {


    private ViewObserver observer;

    @Override
    public void setObserver(ViewObserver observer) {
        this.observer = observer;
    }

    @Override
    public void showTables(Collection<Table> tables) {
        for (Table table : tables) {
            System.out.println(table);
        }
    }

    @Override
    public void showReservationTableResult(int reservationNo) {
        if (reservationNo > 0) {
            System.out.printf("Столик успешно забронирован. Номер вашей брони: #%d\n", reservationNo);
        } else {
            System.out.println("Что-то пошло не так, попробуйте повторить попытку позже.");
        }
    }

    @Override
    public void showChangeReservation(int newReservationNo) {
        if (newReservationNo > 0) {
            System.out.printf("Изменение брони произведено успешно. Номер вашей новой брони: #%d\n", newReservationNo);
        } else {
            System.out.println("Что-то пошло не так, попробуйте повторить попытку позже.");
        }
    }

    @Override
    public void reservationTable(Date orderDate, int tableNo, String name) {
        if (observer != null)
            observer.onReservationTable(orderDate, tableNo, name);
    }

    /**
     * TODO: Доработать самостоятельнов рамках домашней работы
     */
    @Override
    public void changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name) {
        if (observer != null)
            observer.onChangeReservationTable(oldReservation, reservationDate, tableNo, name);
    }


}
