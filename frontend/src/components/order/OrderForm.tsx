import { useState } from "react";
import { TextField, Button, Stack } from "@mui/material";
import { createOrder } from "../../services/orderService";

export default function OrderForm() {
  const [productName, setProductName] = useState("");
  const [quantity, setQuantity] = useState(1);
  const [price, setPrice] = useState(0);

  const handleSubmit = async () => {
    try {
      const order = await createOrder({
        productName,
        quantity,
        price
      });
      console.log("Order created:", order);
    } catch (err) {
      console.error("Order creation failed", err);
    }
  };

  return (
    <Stack spacing={2} width={300}>
      <TextField
        label="Product Name"
        value={productName}
        onChange={(e) => setProductName(e.target.value)}
      />
      <TextField
        label="Quantity"
        type="number"
        value={quantity}
        onChange={(e) => setQuantity(Number(e.target.value))}
      />
      <TextField
        label="Price"
        type="number"
        value={price}
        onChange={(e) => setPrice(Number(e.target.value))}
      />
      <Button variant="contained" onClick={handleSubmit}>
        Create Order
      </Button>
    </Stack>
  );
}