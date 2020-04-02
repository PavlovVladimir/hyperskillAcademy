package com.hyperskilldev.interfaces;

public class AsciiCharSequence implements java.lang.CharSequence {
    private byte[] array;

    AsciiCharSequence(byte[] array) {
        this.array = array;
    }

    @Override
    public int length() {
        return array.length;
    }

    @Override
    public char charAt(int i) {
        return (char) array[i];
    }

    @Override
    public CharSequence subSequence(int i, int i1) {
        String str = new String(this.array).substring(i, i1);
        byte[] res = str.getBytes();
        return new AsciiCharSequence(res);
    }

    @Override
    public String toString() {
        return new String(this.array);
    }
}