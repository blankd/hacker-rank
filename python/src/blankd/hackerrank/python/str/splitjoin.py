'''
Created on Jun 11, 2017

@author: blankd

https://www.hackerrank.com/challenges/python-string-split-and-join
'''

#The obvious answer
def split_and_join(s, delim = "-"):
  return delim.join(s.split())

if __name__ == '__main__':
  print split_and_join(raw_input())