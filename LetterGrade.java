package sol;

public class LetterGrade implements IGrade {
    Letter grade;

    public LetterGrade(Letter gra) {
        this.grade = gra;
    }

    public boolean isPassing() {
        if (grade != sol.Letter.NC) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return switch (this.grade) {
            case A -> "A";
            case B -> "B";
            case C -> "C";
            case NC -> "NC";
        };
    }
}

