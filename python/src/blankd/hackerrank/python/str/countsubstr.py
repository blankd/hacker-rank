'''
Created on Jun 11, 2017

@author: blankd
https://www.hackerrank.com/challenges/find-a-string
'''

#I am sure there are other python tricks this trick came to my mind first
def count_substring(word,sub):
  ret = 0
  subInd = word.find(sub)
  while(subInd != -1):
    ret += 1
    subInd = word.find(sub, subInd+1)
  return ret
if __name__ == '__main__':
  print count_substring(raw_input(), raw_input())