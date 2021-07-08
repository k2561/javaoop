package chop8.InsuranceCalculater;

/**
 *保险
 */
public class InsuranceCalculater {
    private int birthYear;

    public int pay() throws Exception {
        int insurance = 0;
        int age = 2008 - this.getBirthYear();
        int driverAge = 2008 - age;
        if (age < 16) {
            throw new Exception("年龄太小，无需保险！");
        }
        if (driverAge < 4) {
            insurance = 1000;
        } else  {
            insurance = 600;
        }
        return insurance;
    }

    /**
     * @return age
     */
    public int getBirthYear() {
        return birthYear;
    }

    /**
     *            要设置的 age
     */
    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
}
