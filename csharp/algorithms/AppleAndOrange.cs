using System;
using System.IO;

  // Solution for Apple and Orange https://www.hackerrank.com/challenges/apple-and-orange/problem
namespace algorithms
{
  namespace implementation
  {
    public class AppleAndOrange
    {
      private int _s;
      private int _t;
      private int _appleTree;
      private int _orangeTree;
      private int[] _apples;
      private int[] _oranges;

      public void SetData(string pathToTest)
      {
        var lines = File.ReadAllLines(pathToTest);
        var sAndT = lines[0].Split(' ');
        this._s = Convert.ToInt32(sAndT[0]);
        this._t = Convert.ToInt32(sAndT[1]);

        var trees = lines[1].Split(' ');
        this._appleTree = Convert.ToInt32(trees[0]);
        this._orangeTree = Convert.ToInt32(trees[1]);

        this._apples = Array.ConvertAll(lines[3].Split(' '), Convert.ToInt32);
        this._oranges = Array.ConvertAll(lines[4].Split(' '), Convert.ToInt32);
      }

      public void Solution()
      {
        var orangeHits = 0;
        var appleHits = 0;
        foreach (var apple in this._apples)
        {
          var distance = apple + this._appleTree;
          appleHits += (distance >= this._s && distance <= this._t) ? 1 : 0;
        }
        foreach (var orange in this._oranges)
        {
          var distance = orange + this._orangeTree;
          orangeHits += (distance >= this._s && distance <= this._t) ? 1 : 0;
        }
        Console.WriteLine(appleHits);
        Console.WriteLine(orangeHits);
      }
    }
  }
}