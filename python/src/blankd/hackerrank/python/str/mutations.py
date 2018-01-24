'''
Created on Jun 11, 2017

@author: blankd
https://www.hackerrank.com/challenges/python-mutations
'''

#No Comment answer is in explaination
def mutate_string(word, pos, letter):
  return word[:pos] + letter + word[(pos+1):]

if __name__ == '__main__':
  w = raw_input()
  p, l = raw_input().split()
  print mutate_string(w, int(p), l)