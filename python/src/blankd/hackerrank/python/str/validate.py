'''
Created on Jun 11, 2017

@author: blankd

https://www.hackerrank.com/challenges/string-validators
'''
#The kicker for this one is the fact that it is all or logic.
if __name__ == '__main__':
  alpha = False
  num = False
  lower = False
  upper = False
  s = raw_input()
  
  for c in s:
    if not alpha and c.isalpha():
      alpha = True
    if not num and c.isdigit():
      num = True
    if not lower and c.islower():
      lower = True
    if not upper and c.isupper():
      upper = True
      
  print alpha or num
  print alpha
  print num
  print lower
  print upper