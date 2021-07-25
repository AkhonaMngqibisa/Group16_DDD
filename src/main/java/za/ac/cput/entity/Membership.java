/* Membership.java
 * Membership entity for the gym system
 * Author: Haroun Mohamed-Fakier [219095523]
 * Date: 09 June 2021
 */

package za.ac.cput.entity;

import java.util.Date;
import java.util.Calendar;

public class Membership {

    public static class Builder {
        private int id;
        private int memberID;
        private String type;
        private double totalFees;
        private Date expireDate;

        public Builder(Membership membership) {
            this.id = membership.id;
            this.memberID = membership.memberID;
            this.type = membership.type;
            this.totalFees = membership.totalFees;
            this.expireDate = membership.expireDate;
        }

        public Builder(int id) {
            this.id = id;
        }

        public Builder addMember(int memberID)
        {
            this.memberID = memberID;

            return this;
        }

        public Builder setType(String type)
        {
            this.type = type;

            return this;
        }

        public Builder setTotalFees(double totalFees)
        {
            this.totalFees = totalFees;

            return this;
        }

        public Membership build()
        {
            Membership m = new Membership();
            m.id = this.id;
            m.memberID = this.memberID;
            m.type = this.type;
            m.totalFees = this.totalFees;
            Date now = new Date();
            Calendar c = Calendar.getInstance();
            c.setTime(now);
            m.expireDate = c.getTime();

            return m;
        }

        public Builder copy(Membership membership) {
            this.id = membership.id;
            this.memberID = membership.memberID;
            this.type = membership.type;
            this.totalFees = membership.totalFees;
            this.expireDate = membership.expireDate;

            return this;
        }
    }

    private int id;
    private int memberID;
    private String type;
    private double totalFees;
    private Date expireDate;

    private Membership() {}

    public int getMembershipID() {
        return id;
    }

    public int getMemberID() {
        return memberID;
    }

    public String getMembershipType() {
        return type;
    }

    public double getTotalFees() {
        return totalFees;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public double calculateTotalRenewal()
    {
        return 300;
    }

    public double calculateTotalFees(double addFees)
    {
        totalFees += addFees;
        return totalFees;
    }

    public String toString() {
        return String.format(
                """
                        MEMBERSHIP
                        ID: %d
                        Member ID: %d
                        Type: %s
                        Total fees: %.2f
                        Expiry Date: %s
                        """,
            id, memberID, type, totalFees, expireDate.toString()
        );
    }
}
