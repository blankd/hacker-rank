
using System.IO;
using algorithms.implementation;

namespace run_hack
{
  internal class Program
  {
    public static void Main(string[] args)
    {
      IHackerRankSolution solution;
      solution.PrepareData(File.ReadAllLines(args[0]));
      solution.RunSolution();
    }
  }
}