// 4. Personalized Meal Plan Generator
import java.util.*;

interface MealPlan { String getType(); }
class VegetarianMeal implements MealPlan { public String getType() { return "Vegetarian"; } }
class VeganMeal implements MealPlan { public String getType() { return "Vegan"; } }
class KetoMeal implements MealPlan { public String getType() { return "Keto"; } }
class Meal<T extends MealPlan> {
    T plan;
    Meal(T plan) { this.plan = plan; }
    public String toString() { return plan.getType(); }
}
class MealPlanGenerator {
    public static <T extends MealPlan> Meal<T> generateMealPlan(T plan) {
        // Add validation logic as needed
        return new Meal<>(plan);
    }
    public static void main(String[] args) {
        Meal<VegetarianMeal> veg = generateMealPlan(new VegetarianMeal());
        Meal<VeganMeal> vegan = generateMealPlan(new VeganMeal());
        System.out.println(veg);
        System.out.println(vegan);
    }
}
