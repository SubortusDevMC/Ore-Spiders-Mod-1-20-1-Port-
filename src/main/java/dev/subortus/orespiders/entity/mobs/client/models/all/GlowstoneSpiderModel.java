package dev.subortus.orespiders.entity.mobs.client.models.all;

import dev.subortus.orespiders.entity.mobs.server.entities_all.GlowstoneSpiderEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;

public class GlowstoneSpiderModel<T extends GlowstoneSpiderEntity> extends HierarchicalModel<T> {
    private final ModelPart root;
    private final ModelPart head;
    private final ModelPart rightHindLeg;
    private final ModelPart leftHindLeg;
    private final ModelPart rightMiddleHindLeg;
    private final ModelPart leftMiddleHindLeg;
    private final ModelPart rightMiddleFrontLeg;
    private final ModelPart leftMiddleFrontLeg;
    private final ModelPart rightFrontLeg;
    private final ModelPart leftFrontLeg;

    public GlowstoneSpiderModel(ModelPart pRoot) {
        this.root = pRoot;
        this.head = pRoot.getChild("head");
        this.rightHindLeg = pRoot.getChild("right_hind_leg");
        this.leftHindLeg = pRoot.getChild("left_hind_leg");
        this.rightMiddleHindLeg = pRoot.getChild("right_middle_hind_leg");
        this.leftMiddleHindLeg = pRoot.getChild("left_middle_hind_leg");
        this.rightMiddleFrontLeg = pRoot.getChild("right_middle_front_leg");
        this.leftMiddleFrontLeg = pRoot.getChild("left_middle_front_leg");
        this.rightFrontLeg = pRoot.getChild("right_front_leg");
        this.leftFrontLeg = pRoot.getChild("left_front_leg");
    }

    public static LayerDefinition createGlowstoneSpiderBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        int i = 15;
        partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(32, 4).addBox(-4.0F, -4.0F, -8.0F, 8.0F, 8.0F, 8.0F)
                .texOffs(54, 26).addBox(-1.0F, -5.5F, -2.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(54, 26).addBox(-1.0F, -5.75F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(53, 25).addBox(-1.0F, -5.0F, -4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),PartPose.offset(0.0F, 15.0F, -3.0F));
        partdefinition.addOrReplaceChild("body0", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F)
                .texOffs(53, 25).addBox(-1.0F, -4.5F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(53, 25).addBox(-1.0F, -5.25F, -3.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(53, 25).addBox(-1.0F, -5.25F, 1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),PartPose.offset(0.0F, 15.0F, 0.0F));
        PartDefinition body = partdefinition.addOrReplaceChild("body1", CubeListBuilder.create().texOffs(0, 12).addBox(-5.0F, -4.0F, -6.0F, 10.0F, 8.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 15.0F, 9.0F));        CubeListBuilder cubelistbuilder = CubeListBuilder.create().texOffs(18, 0).addBox(-15.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F);

        body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(50, 25).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.5F, 4.0F, 0.0F, 3.1416F, 0.0F));

        body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(50, 25).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.5F, 2.0F, 0.0F, 3.1416F, 0.0F));

        body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(50, 29).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.5F, 0.0F, 0.0F, 3.1416F, 0.0F));

        body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(49, 27).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.5F, -2.0F, 0.0F, 3.1416F, 0.0F));

        body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(56, 23).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.75F, 3.0F, 0.0F, 3.1416F, 0.0F));

        body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(56, 23).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.75F, 1.0F, 0.0F, 3.1416F, 0.0F));

        body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(57, 22).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.75F, -1.0F, 0.0F, 3.1416F, 0.0F));

        body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(50, 27).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.75F, -3.0F, 0.0F, 3.1416F, 0.0F));

        body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(56, 23).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.25F, -4.0F, 0.0F, 3.1416F, 0.0F));

        body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(54, 26).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.75F, -5.0F, 0.0F, 3.1416F, 0.0F));

        CubeListBuilder cubelistbuilder1 = CubeListBuilder.create().texOffs(18, 0).mirror().addBox(-1.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F);
        partdefinition.addOrReplaceChild("right_hind_leg", cubelistbuilder, PartPose.offset(-4.0F, 15.0F, 2.0F));
        partdefinition.addOrReplaceChild("left_hind_leg", cubelistbuilder1, PartPose.offset(4.0F, 15.0F, 2.0F));
        partdefinition.addOrReplaceChild("right_middle_hind_leg", cubelistbuilder, PartPose.offset(-4.0F, 15.0F, 1.0F));
        partdefinition.addOrReplaceChild("left_middle_hind_leg", cubelistbuilder1, PartPose.offset(4.0F, 15.0F, 1.0F));
        partdefinition.addOrReplaceChild("right_middle_front_leg", cubelistbuilder, PartPose.offset(-4.0F, 15.0F, 0.0F));
        partdefinition.addOrReplaceChild("left_middle_front_leg", cubelistbuilder1, PartPose.offset(4.0F, 15.0F, 0.0F));
        partdefinition.addOrReplaceChild("right_front_leg", cubelistbuilder, PartPose.offset(-4.0F, 15.0F, -1.0F));
        partdefinition.addOrReplaceChild("left_front_leg", cubelistbuilder1, PartPose.offset(4.0F, 15.0F, -1.0F));
        return LayerDefinition.create(meshdefinition, 64, 32);
    }

    public ModelPart root() {
        return this.root;
    }

    public void setupAnim(T pEntity, float pLimbSwing, float pLimbSwingAmount, float pAgeInTicks, float pNetHeadYaw, float pHeadPitch) {
        this.head.yRot = pNetHeadYaw * ((float)Math.PI / 180F);
        this.head.xRot = pHeadPitch * ((float)Math.PI / 180F);
        float f = ((float)Math.PI / 4F);
        this.rightHindLeg.zRot = (-(float)Math.PI / 4F);
        this.leftHindLeg.zRot = ((float)Math.PI / 4F);
        this.rightMiddleHindLeg.zRot = -0.58119464F;
        this.leftMiddleHindLeg.zRot = 0.58119464F;
        this.rightMiddleFrontLeg.zRot = -0.58119464F;
        this.leftMiddleFrontLeg.zRot = 0.58119464F;
        this.rightFrontLeg.zRot = (-(float)Math.PI / 4F);
        this.leftFrontLeg.zRot = ((float)Math.PI / 4F);
        float f1 = -0.0F;
        float f2 = ((float)Math.PI / 8F);
        this.rightHindLeg.yRot = ((float)Math.PI / 4F);
        this.leftHindLeg.yRot = (-(float)Math.PI / 4F);
        this.rightMiddleHindLeg.yRot = ((float)Math.PI / 8F);
        this.leftMiddleHindLeg.yRot = (-(float)Math.PI / 8F);
        this.rightMiddleFrontLeg.yRot = (-(float)Math.PI / 8F);
        this.leftMiddleFrontLeg.yRot = ((float)Math.PI / 8F);
        this.rightFrontLeg.yRot = (-(float)Math.PI / 4F);
        this.leftFrontLeg.yRot = ((float)Math.PI / 4F);
        float f3 = -(Mth.cos(pLimbSwing * 0.6662F * 2.0F + 0.0F) * 0.4F) * pLimbSwingAmount;
        float f4 = -(Mth.cos(pLimbSwing * 0.6662F * 2.0F + (float)Math.PI) * 0.4F) * pLimbSwingAmount;
        float f5 = -(Mth.cos(pLimbSwing * 0.6662F * 2.0F + ((float)Math.PI / 2F)) * 0.4F) * pLimbSwingAmount;
        float f6 = -(Mth.cos(pLimbSwing * 0.6662F * 2.0F + ((float)Math.PI * 1.5F)) * 0.4F) * pLimbSwingAmount;
        float f7 = Math.abs(Mth.sin(pLimbSwing * 0.6662F + 0.0F) * 0.4F) * pLimbSwingAmount;
        float f8 = Math.abs(Mth.sin(pLimbSwing * 0.6662F + (float)Math.PI) * 0.4F) * pLimbSwingAmount;
        float f9 = Math.abs(Mth.sin(pLimbSwing * 0.6662F + ((float)Math.PI / 2F)) * 0.4F) * pLimbSwingAmount;
        float f10 = Math.abs(Mth.sin(pLimbSwing * 0.6662F + ((float)Math.PI * 1.5F)) * 0.4F) * pLimbSwingAmount;
        this.rightHindLeg.yRot += f3;
        this.leftHindLeg.yRot += -f3;
        this.rightMiddleHindLeg.yRot += f4;
        this.leftMiddleHindLeg.yRot += -f4;
        this.rightMiddleFrontLeg.yRot += f5;
        this.leftMiddleFrontLeg.yRot += -f5;
        this.rightFrontLeg.yRot += f6;
        this.leftFrontLeg.yRot += -f6;
        this.rightHindLeg.zRot += f7;
        this.leftHindLeg.zRot += -f7;
        this.rightMiddleHindLeg.zRot += f8;
        this.leftMiddleHindLeg.zRot += -f8;
        this.rightMiddleFrontLeg.zRot += f9;
        this.leftMiddleFrontLeg.zRot += -f9;
        this.rightFrontLeg.zRot += f10;
        this.leftFrontLeg.zRot += -f10;
    }
}