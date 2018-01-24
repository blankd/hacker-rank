'''
Created on Jun 9, 2017

@author: blankd
'''

if __name__ == '__main__':
  NAME_IND = 0
  GRADE_IND = 1
  SECOND_LOWEST_IND = 1
  students = list()
  marks = set() #I only need one of each grade no reason to run a loop twice
  for _ in range(int(raw_input())):
    name = raw_input()
    mark = float(raw_input())
    students.append([name, mark])
    marks.add(mark)
  
  #Sort the marks list in ascending order
  sortedMarks = sorted(list(marks))
  secondLowest = sortedMarks[SECOND_LOWEST_IND]
  
  for student in sorted(students):
    #Sorting students seems to sort based on the first index
    sMark = student[GRADE_IND]
    
    if sMark == secondLowest:
      print student[NAME_IND]
        
  

