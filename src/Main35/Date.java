package Main35;

class Date {
    int year = 1970;
    int month = 1;
    int day = 1;

    public static final int YEAR = 1;
    public static final int MONTH = 2;
    public static final int DAY = 3;

    public void setYear(int year){
        this.year = year;
    }

    public void setMonth(int month) {
        if (month >0 && month <= 12) {
            this.month = month;
        } else {
            System.out.println("Invalid Month");
        }

    }

    public void setDate(int day) {
        if (day >0 && day <= 31) {
            this.day = day;
        } else {
            System.out.println("Invalid Day");
        }
    }
    public void set(int field, int value) {
        switch (field) {
            case YEAR:
                setYear(value);
                break;
            case MONTH:
                setMonth(value);
                break;
            case DAY:
                setDate(value);
                break;
            default:
                System.out.println("Invalid field.");
        }
    }

    public int getYear() {
        return this.year;
    }

    public int getMonth() {
        return this.month;
    }

    public int getDay() {
        return this.day;
    }

    public void printDate() {
        System.out.println(year + "-" + month + "-" + day);
    }
}
