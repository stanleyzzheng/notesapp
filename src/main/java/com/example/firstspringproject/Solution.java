package com.example.firstspringproject;

class TreeNode {

  int val;
  TreeNode left;
  TreeNode right;

  TreeNode() {}

  TreeNode(int val) {
    this.val = val;
  }

  TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }
}

class Solution {

  private int cnt = 0;

  class Pair {

    int sum, size;

    Pair() {
      this.sum = this.size = 0;
    }

    Pair(int sum, int size) {
      this.sum = sum;
      this.size = size;
    }
  }

  private Pair helper(TreeNode root, Pair p) {
    if (root == null) return new Pair();
    Pair l = helper(root.left, new Pair());
    Pair r = helper(root.right, new Pair());
    p.sum = l.sum + r.sum + root.val;
    p.size = l.size + r.size + 1;
    if (root.val == p.sum / p.size) cnt++;
    return p;
  }

  public int averageOfSubtree(TreeNode root) {
    helper(root, new Pair());
    return cnt;
  }
}
