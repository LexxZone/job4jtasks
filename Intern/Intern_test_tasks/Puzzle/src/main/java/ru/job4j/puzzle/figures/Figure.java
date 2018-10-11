package ru.job4j.puzzle.figures;

/**
 * 11.10.2018
 *
 * @author Alexey Dvoryaninov  ( lexxzone@gmail.com )
 */
public interface Figure {
    default boolean movable() {
        return true;
    }

    Cell position();

    Cell[] way(Cell source, Cell dest);

    default String icon() {
        return String.format(
                "%s.png", this.getClass().getSimpleName()
        );

    }

    Figure copy(Cell dest);

}
