
using System.IO;
using algorithms.implementation;

namespace run_hack
{
  internal class Program
  {
    public static void Main(string[] args)
    {
      IHackerRankSolution solution = new AppleAndOrange();
      solution.PrepareData(File.ReadAllLines(args[0]));
      solution.RunSolution();
    }
  }
}