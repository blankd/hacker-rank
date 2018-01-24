'''
Created on Jun 11, 2017

@author: blankd
https://www.hackerrank.com/challenges/alphabet-rangoli
'''
def print_rangoli(size):
  #Ord returns the unicode version of whatever is put into here
  #https://docs.python.org/2/library/functions.html#ord
  #Make sense of the link on your own
  letters = [chr(ord('a') + (i-1)) for i in range(size,0,-1)]
  pad = len(letters)  + ((len(letters)-1)*3)#Not the best calculator but math is not my thing
  
  output = list()
  for k in range(len(letters)):
    left = '-'.join(letters[0:k+1])#Ensures at least one character is returned
    right = '-'.join(reversed(letters[0:k]))#Returns nothing if on the first character
    if len(right):
      print (left + '-' + right).center(pad, '-')
      output.append((left + '-' + right).center(pad, '-'))
    else:
      print letters[0].center(pad, '-')
      output.append(letters[0].center(pad, '-'))
  
  #Need to skip more thanks to zero based indexing
  for o in range(len(output)-2, -1, -1):
    #Has range is exclusive and I cannot figure out how to make inclusive
    print output[o]
  #Not my best solution I am sure that the discussions has more advanced solutions.
  #This is the best I can do with my current level or knowledge
  
if __name__ == '__main__':
  print_rangoli(int(raw_input()))