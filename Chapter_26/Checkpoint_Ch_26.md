# Checkpoint Answers Chapter 26 #
## 26.1 ##
AVL trees are a form of BST tree but always well-balanced. In an AVL tree, the difference between the heights of two subtrees for every node is 0 or 1.  

The balance factor of a node is the height of its right subtree minus the height of its left subtree.  

A node is said to be balanced if its balance factor is -1, 0, or 1.  

A node is said to be left-heavy if its balance factor is -1.  

A node is said to be right-heavy if its balance factor is +1.  

## 26.4 ##
AVLTreeNode defines the data field `height`, that stores the height of the node.   

AVLTreeNode inherits from TreeNode so it will also have the data fields `left` and `right`, that points to the left and right subtree.  
