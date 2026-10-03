package InnerClasses_UMLdiagrams_w8.assignments_problems;

public class MembershipDeskMain {
    public static void main(String[] args) {
        MembershipDesk desk = new MembershipDesk();

        Member asha = new Member("Asha");
        Member ravi = new Member("Ravi");

        Membership ashaMembership = desk.buyMembership(asha, new QuarterlyPlan());
        Membership raviMembership = desk.buyMembership(ravi, new MonthlyPlan());

        desk.checkIn(ashaMembership);

        desk.freezeMembership(ashaMembership);

        desk.checkIn(ashaMembership);

        desk.expireMembership(raviMembership);

        desk.freezeMembership(raviMembership);
    }
}