package week9.word.Messages;

//**
//Messages.java       Author: Lewis/Loftus
//
//Demonstrates the use of an overridden method.
//**

public class Messages
{
//-----------------------------------------------------------------
//  Creates two objects and invokes the message method in each.
//-----------------------------------------------------------------
public static void main(String[] args)
{
    Thought sentences = new Thought();
    Advice dates = new Advice();

    sentences.message();

    dates.message();  // overridden
}
}