/* Membership.java
 * Membership entity for the gym system
 * Author: Haroun Mohamed-Fakier [219095523]
 * Date: 09 June 2021
 */

package za.ac.cput.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.Calendar;

@Entity
@Table(name="membership")
public class Membership {
    @Id
    private int id;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="member_id")
    private Member member;

    private String type;
    private double totalFees;
    private Date expireDate;

    public static class Builder {
        private int id;
        private Member member;
        private String type;
        private double totalFees;
        private Date expireDate;

        public Builder(Membership membership) {
            this.id = membership.id;
            this.member = membership.member;
            this.type = membership.type;
            this.totalFees = membership.totalFees;
            this.expireDate = membership.expireDate;
        }

        public Builder(int id) {
            this.id = id;
        }

        public Builder addMember(Member member)
        {
            this.member = member;

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
            m.member = this.member;
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
            this.member = membership.member;
            this.type = membership.type;
            this.totalFees = membership.totalFees;
            this.expireDate = membership.expireDate;

            return this;
        }
    }

    public Membership() {}

    public int getId() {
        return id;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getTotalFees() {
        return totalFees;
    }

    public void setTotalFees(double totalFees) {
        this.totalFees = totalFees;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
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

    @Override
    public String toString() {
        return String.format(
            "MEMBERSHIP\n" +
            "ID: %d\n" +
            "Member ID: %d\n" +
            "Type: %s\n" +
            "Total fees: %.2f\n" +
            "Expiry Date: %s\n",
            id, member.getMemberID(), type, totalFees, expireDate.toString()
        );
    }
}
