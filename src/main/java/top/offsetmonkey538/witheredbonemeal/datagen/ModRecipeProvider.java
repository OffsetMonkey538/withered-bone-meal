package top.offsetmonkey538.witheredbonemeal.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import top.offsetmonkey538.witheredbonemeal.init.ModItems;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void generateRecipes(Consumer<RecipeJsonProvider> exporter) {
        offerReversibleCompactingRecipesWithReverseRecipeGroup(exporter, ModItems.WITHERED_BONE_MEAL, ModItems.WITHERED_BONE_BLOCK, "withered_bone_meal_from_withered_bone_block", "withered_bone_meal");
        ShapelessRecipeJsonBuilder.create(ModItems.WITHERED_BONE_MEAL, 3).input(ModItems.WITHERED_BONE).group("withered_bone_meal").criterion("has_withered_bone", conditionsFromItem(ModItems.WITHERED_BONE)).offerTo(exporter, "withered_bone_meal_from_withered_bone");
        ShapelessRecipeJsonBuilder.create(Items.BLACK_DYE).input(ModItems.WITHERED_BONE_MEAL).group("black_dye").criterion("has_withered_bone_meal", conditionsFromItem(ModItems.WITHERED_BONE_MEAL)).offerTo(exporter, "black_dye_from_withered_bone_meal");
    }
}
