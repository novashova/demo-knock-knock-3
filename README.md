# Knock-Knock Architecture Lab

Welcome to the stateful server lab. Today, we are learning about **Separation of Concerns**. 

I have provided the "brain" of the application (`KnockKnockProtocol.java`). It knows how to tell jokes, but it doesn't know how to talk to the internet. Your job is to build the network architecture to connect this brain to a remote client.

## Lab Instructions

**Step 1: Setup**
- Click **"Use this template"** -> **"Create a new repository"**.
- Name it `knock-knock-lab` and make it **Private**.
- Open your terminal and `git clone` your new repository to your local machine.

**Step 2: Build the Server**
Open `KnockKnockServer.java`. Follow the `TODO` comments to open Port `4444` and wire the network socket into the `KnockKnockProtocol` logic. 

**Step 3: Build the Client**
Open `KnockKnockClient.java`. Follow the `TODO` comments to connect to `localhost` on port `4444`. Remember, your client needs to read from the network *and* the user's keyboard!

**Step 4: Test the Architecture**
1. Open a terminal and run your Server.
2. Open a *second* terminal and run your Client. 
3. Play through the joke. Try typing the wrong response to see how the Protocol handles errors!
4. *(Optional)* Find out a partner's IP address, change the `localhost` in your client to their IP, and tell jokes across the room.

**Step 5: Save and Submit**
- In your terminal, run the Git loop:
  `git add .`
  `git commit -m "Completed network architecture"`
  `git push`
- Go to your GitHub repository settings and add me as a collaborator so I can grade it.
