package io.github.sirjain0.perfectplushies.block;

import net.minecraft.ChatFormatting;

public class MrRancherPlushieBlock extends PlushieBlock {
	@Override
	public ChatFormatting getMessageColor() {
		return ChatFormatting.BLUE;
	}

	@Override
	public String getMessageSender() {
		return "Mr. Rancher";
	}

	@Override
	public String getMessage() {
		return "Bonjour!";
	}
}
