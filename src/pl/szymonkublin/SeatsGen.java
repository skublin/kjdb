package pl.szymonkublin;

import java.util.HashSet;
import java.util.Set;

public class SeatsGen {

    public Set<String> createSeats(int rows, int seatsInRow, int firstRowNumber) {
        HashSet<String> seats = new HashSet<String>();

        for (int i = firstRowNumber; i <= rows; i++) {
            char currentLetter = 'A';

            for (int j = 0; j < seatsInRow; j++) {
                currentLetter += j;
                //if (currentLetter > 'Z') {
                //currentLetter
                //}
                String currentSeat = new String();
                currentSeat += i;
                currentSeat += currentLetter;
                seats.add(currentSeat);
            }
        }
        System.out.println(seats);
        return seats; // TODO: Implement
    }
}

