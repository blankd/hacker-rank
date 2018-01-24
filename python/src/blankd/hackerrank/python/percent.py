'''
Created on Jun 9, 2017

@author: blankd
'''

if __name__ == '__main__':
  NAME_IND = 0;
  FIRST_GRADE = 1
  ROUND_TO = 2
  STR_FMT = "%.2f"
  marks = dict()
  
  for s in range(int(raw_input())):
    data = raw_input().split()
    sum = float(0)
    for d in range(FIRST_GRADE, len(data)):
      sum += float(data[d])
    student = data[NAME_IND] 
    data.pop(NAME_IND)#Remove name from list to get number of grades
    marks[student] = sum/(len(data))
  
  print STR_FMT % round(marks[raw_input()],ROUND_TO)