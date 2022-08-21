public class palindromelikedlist {

        Node head;
        class Node{
            int data;
            Node next;
            Node(int data){
                this.data=data;
                this.next=null;
            }}
        public Node reverseLinkedList(Node head){
            Node prev=null;
            Node curr=head;
            while(curr != null){
                Node next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            return prev;
        }
        public Node findmiddle(Node head){
            Node hare=head;
            Node turtle=head;
            while(hare.next !=null || hare.next.next != null){
                hare=hare.next.next;
                turtle=turtle.next;
            }
            return  turtle;

        }
        public boolean isPalindrome(Node head){
            if(head == null || head.next == null ){
                return true;
            }
            Node middle=findmiddle(head);//1st ka half ka end
            Node secondhalfkastart=reverseLinkedList(middle.next);
            Node firsthalfkastart=head;
            while(secondhalfkastart != null){
                if(firsthalfkastart.data != secondhalfkastart.data){
                    return false;
                }
                firsthalfkastart=firsthalfkastart.next;
                secondhalfkastart=secondhalfkastart.next;

            }
            return true;
        }

    }


