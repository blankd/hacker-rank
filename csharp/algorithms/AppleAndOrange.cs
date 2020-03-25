using System;
using System.IO;
using run_hack;

// Solution for Apple and Orange https://www.hackerrank.com/challenges/apple-and-orange/problem
namespace algorithms
{
  namespace implementation
  {
    public class AppleAndOrange : IHackerRankSolution
    {
      private static readonly int S_AND_APPLE_TREE = 0;
      private static readonly int T_AND_ORANGE_TREE = 1;
      private int[] _sAndT;
      private int[] _trees;
      private int[] _apples;
      private int[] _oranges;

      public void PrepareData(string[] data)
      {
        this._sAndT = Array.ConvertAll(data[0].Split(' '), Convert.ToInt32);
        
        this._trees = Array.ConvertAll(data[1].Split(' '), Convert.ToInt32);
        
        this._apples = Array.ConvertAll(data[3].Split(' '), Convert.ToInt32);
        this._oranges = Array.ConvertAll(data[4].Split(' '), Convert.ToInt32);
      }

      public void RunSolution()
      {
        var hits = new int[2] {0, 0};
        foreach (var apple in this._apples)
        {
          hits[0] += this.DidHit(apple + this._trees[S_AND_APPLE_TREE]);
        }
        foreach (var orange in this._oranges)
        {
          hits[1] += this.DidHit(orange + this._trees[T_AND_ORANGE_TREE]);
        }

        foreach (var hit in hits)
        {
          Console.WriteLine(hit);
        }
      }

      private int DidHit(int distance)
      {
        return (distance >= this._sAndT[S_AND_APPLE_TREE] && distance <= _sAndT[T_AND_ORANGE_TREE])
          ? 1
          : 0;
      }
    }
  }
}