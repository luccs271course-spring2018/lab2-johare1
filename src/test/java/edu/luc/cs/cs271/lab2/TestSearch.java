package edu.luc.cs.cs271.lab2;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class TestSearch {
  
  Team[] makeArrayFixture(final int size) {
    final Team[] array = new Team[size];
    for (int i = 0; i < size; i++) {
      final String s = Integer.toString(i);
      array[i] = new Team("Team " + s, "Coach " + s, i * 100 + 50);
    }
    return array;
  }
  
  List<Team> makeListFixture(final int size){
    
    List<Team> newList = new ArrayList<Team>();
    
    for(int i = 0; i < size; i++){
      final String s = Integer.toString(i);
      newList.add(new Team("Team" + s, "Coach " + s, i * 100 + 50));
    }
    return newList;
  }

  // DONE makeListFixture
  

  @Test
  public void testFindPositionArray0() {
    final Team[] arr = makeArrayFixture(0);
    assertFalse(Search.findTeamPosition(arr, "Team 5").isPresent());
  }

  @Test
  public void testFindPositionArray10s() {
    final Team[] arr = makeArrayFixture(10);
    assertTrue(Search.findTeamPosition(arr, "Team 5").isPresent());
  }

  @Test
  public void testFindPositionArray10f() {
    final Team[] arr = makeArrayFixture(10);
    assertFalse(Search.findTeamPosition(arr, "Team 11").isPresent());
  }
  
  // DONE: testFindPositionList0, 10s, 10f
  public void testFindPositionList0(){
    final List<Team> testList = makeListFixture(0);
    assertFalse(Search.findTeamPosition(testList,"Team 5").isPresent());
    
  }
  
    public void testFindPositionList10s(){
    final List<Team> testList = makeListFixture(10);
    assertFalse(Search.findTeamPosition(testList,"Team 5").isPresent());
    
  }
  
    public void testFindPositionList10f(){
    final List<Team> testList = makeListFixture(10);
    assertFalse(Search.findTeamPosition(testList,"Team 11").isPresent());
    
  }
  
  
  
  // DONE: testFindMinFundingArray for several sizes and scenarios
  public void testMinFundingArray0(){
    final Team[] arr = makeArrayFixture(0);
    assertFalse(Search.findTeamMinFunding(arr,0).isPresent());
  }
  
  public void testMinFundingArray400(){
    final Team[] arr = makeArrayFixture(5);
    assertFalse(Search.findTeamMinFunding(arr,400).isPresent());
  }
  
  public void testMinFundingArray600(){
    final Team[] arr = makeArrayFixture(5);
    assertFalse(Search.findTeamMinFunding(arr,600).isPresent());
  }

  // DONE: testFindMinFundingArrayFast for several sizes and scenarios
  public void testFinfMinFundingArrayFast0(){
    final Team[] arr = makeArrayFixture(0);
    assertFalse(Search.findTeamMinFundingFast(arr,0).isPresent());
  }
  
  public void testFinfMinFundingArrayFast400(){
    final Team[] arr = makeArrayFixture(5);
    assertFalse(Search.findTeamMinFundingFast(arr,400).isPresent());
  }
  
  public void testFinfMinFundingArrayFast600(){
    final Team[] arr = makeArrayFixture(5);
    assertFalse(Search.findTeamMinFundingFast(arr,600).isPresent());
  }  
  
  
}
