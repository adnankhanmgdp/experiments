#include <iostream>
using namespace std;


struct Node
{
    int data;
    Node* next;
};

Node* insertNode(Node* head)
{
    if(head == 0)
    {
        Node* n = new Node();
        cout << "Enter data: ";
        cin >> n->data;
        n->next = 0;
        head = n;
        return head;
    }
    else
    {
        Node* c = head;
        while(true){
            if(c->next == 0)
            {
                Node* n = new Node();
                cout << "Enter data: ";
                cin >> n->data;
                n->next = 0;
                c->next = n;
                return 0;
            }
            else
            {
                c = c->next;
            }
        }
    }
}

void viewAll(Node* head)
{
    if(head == 0)
    {
        cout  <<  "Linkedlist is empty\n";
    }
    else{
        Node* a = head;
        while(true)
        {
            cout << a->data << ", ";
            a = a->next;
            if(a == 0)
            {
                cout << "\n";
                break;
            }
        }
    }
}

void deleteLast(Node* head)
{
    if(head == 0)
    {
        cout << "Linkedlist already empty\n";
    }
    else
    {
        Node* n = head;
        while(true)
        {
            if(n->next->next == 0)
            {
                n->next=0;
                break;
            }
            n = n->next;
        }
    }
}

void insertAt(Node* head, int indx)
{

}

int main()
{
    Node* A = 0;
    int option;
    while(true)
    {
        cout << "1. Insert node\n";
        cout << "2. View all\n";
        cout << "3. Delete last\n";
        cout << "4. Insert At\n";
        cout << "option: ";
        cin >> option;
        if(option == 1)
        {
           Node* c = insertNode(A);
           if(c != 0)
           {
            A = c;
           }
        }
        else if(option == 4)
        {
           insertAt(A, 2);
        }
        else if(option == 2)
        {
            viewAll(A);
        }
        else if(option == 3)
        {
            deleteLast(A);
        }
    }
    return 0;
}