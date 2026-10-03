package InnerClasses_UMLdiagrams_w8.assignments_problems;

public class MembershipDesk {
    public Membership buyMembership(Member member, MembershipPlan plan) {
        Membership membership = new Membership(member, plan);
        System.out.println(plan.getPlanName() + " membership created for " + member.getName());
        System.out.printf("Fee: ₹%.2f%n", membership.getFee());
        System.out.println("Status: " + membership.getStatus());
        return membership;
    }
    public void checkIn(Membership membership) {
        boolean success = membership.checkIn();
        if (success) {
            System.out.println(membership.getMember().getName() + " checked in successfully");
        } else {
            System.out.println("Check-in denied: " + membership.getMember().getName() + "'s membership is " + membership.getStatus());
        }
    }
    public void freezeMembership(Membership membership) {
        boolean success = membership.freeze();
        if (success) {
            System.out.println(membership.getMember().getName() + "'s membership frozen");
            System.out.println("Status: " + membership.getStatus());
        } else {
            System.out.println("Cannot freeze an " + membership.getStatus() + " membership");
        }
    }
    public void unfreezeMembership(Membership membership) {
        boolean success = membership.unfreeze();
        if (success) {
            System.out.println(membership.getMember().getName() + "'s membership unfrozen");
            System.out.println("Status: " + membership.getStatus());
        } else {
            System.out.println("Cannot unfreeze an " + membership.getStatus() + " membership");
        }
    }
    public void expireMembership(Membership membership) {
        membership.expire();
        System.out.println(membership.getMember().getName() + "'s membership expired");
        System.out.println("Status: " + membership.getStatus());
    }
}