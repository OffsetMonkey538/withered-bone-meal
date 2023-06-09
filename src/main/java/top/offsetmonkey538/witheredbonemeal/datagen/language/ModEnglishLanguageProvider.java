package top.offsetmonkey538.witheredbonemeal.datagen.language;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import top.offsetmonkey538.witheredbonemeal.init.ModBlocks;
import top.offsetmonkey538.witheredbonemeal.init.ModItems;

public class ModEnglishLanguageProvider extends FabricLanguageProvider {
    public ModEnglishLanguageProvider(FabricDataOutput dataOutput) {
        super(dataOutput, "en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(ModBlocks.WITHERED_BONE_BLOCK, "Withered Bone Block");
        translationBuilder.add(ModItems.WITHERED_BONE, "Withered Bone");
        translationBuilder.add(ModItems.WITHERED_BONE_MEAL, "Withered Bone Meal");
    }
}
