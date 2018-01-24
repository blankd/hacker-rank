'''
Created on Jun 11, 2017

@author: blankd

https://www.hackerrank.com/challenges/swap-case
'''

#A more readable answer
def swap_case(s):
  ret = ""
  for i in range(len(s)):
    if s[i].isalpha():
      if s[i].islower():
        ret = ret + s[i].upper()
      else:
        ret = ret + s[i].lower()
    else:#This is a just in case else probably do not need it
      ret = ret + s[i]
  return ret

#A more complex answer
def swapping_case(s):
  #There is a lot going on in here
  #A single line for loop
  #A Ternary operator
  #And initializing an array with a loop
  ret = [c.lower() if c.isupper() else c.upper() for c in s]
  #I wish that python had a better method for turning arrays into strings
  return "".join(ret)

if __name__ == '__main__':
  print swapping_case(raw_input())