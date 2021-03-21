package com.techelevator;

public class HomeworkAssignment {
	
		String submitterName;
		private int possibleMarks;
		private int earnedMarks;
		
		public HomeworkAssignment (int possibleMarks, String submitterName) 
		{
			this.submitterName = submitterName;
			this.possibleMarks = possibleMarks;
			
		}
		
		public void setEarnedMarks(int earnedMarks) {
	        this.earnedMarks = earnedMarks;
	    }
		
		public int getPossibleMarks() {
			
			return possibleMarks;
		
		}
		
		public String getSubmitterName() {
			
			return submitterName;
		}
		
		public int getEarnedMarks() {
			
			return earnedMarks;
		}
		public String getLetterGrade() {
			
			double percent = (double)earnedMarks/possibleMarks;
			
			if (percent >= 0.9) {
				
				return "A";
			}
			if (percent >= 0.8) {
				
				return "B";
			}
			if (percent >= 0.7) {
				
				return "C";
			}
			if (percent >= 0.6) {
				
				return "D";
			}
				return "F";
		}
		
		
	}

