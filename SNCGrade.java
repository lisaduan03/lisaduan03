package sol;

public class SNCGrade implements IGrade {
    boolean pass;
    boolean passDistinction;

    public SNCGrade(SNC snc) {
        if (snc == sol.SNC.SDIST) {
            this.passDistinction = true;
            this.pass = true;
        } else if (snc == sol.SNC.S) {
            this.passDistinction = false;
            this.pass = true;
        } else {
            this.passDistinction = false;
            this.pass = false;
        }
    }

    public boolean isPassing() {
        if (pass == true) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        if (this.passDistinction == true) {
            return "S*";
        } else if (this.pass == true) {
            return "S";
        } else {
            return "NC";
        }
    }
}
