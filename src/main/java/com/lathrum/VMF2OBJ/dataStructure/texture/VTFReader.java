package com.lathrum.VMF2OBJ.dataStructure.texture;

public class VTFReader {

    //https://developer.valvesoftware.com/wiki/VTF_(Valve_Texture_Format)#VTF_header
    public static int getWidth(byte[] buf) {
		return btoi(buf[16]) + (btoi(buf[17]) << 8);
	}

	public static int getHeight(byte[] buf) {
		return btoi(buf[18]) + (btoi(buf[19]) << 8);
	}

    private static int btoi(byte b) {
		int a = b;
		return (a < 0 ? 256 + a : a);
	}
}
