public class Student {
    private String name;
    private int missedLessons;
    private boolean jobCenter;


    public Student(String name, int missedLessons, boolean jobCenter) {
        this.name = name;
        this.missedLessons = missedLessons;
        this.jobCenter = jobCenter;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", missedLessons=" + missedLessons +
                ", jobCenter=" + jobCenter +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getMissedLessons() {
        return missedLessons;
    }

    public boolean isJobCenter() {
        return jobCenter;
    }
}

/*
        private
        [packege private]
        protected
        public
    */
