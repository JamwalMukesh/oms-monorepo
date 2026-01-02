import { Box, Button, TextField, Typography } from "@mui/material";
import { useState } from "react";

const CreateOrderPage = () => {
    const [productName, setProductName] = useState<string>('');
    const [quantity, setQuantity] = useState<number>(1);
    const [price, setPrice] = useState<number>(0);

    const handleSubmit = () => {
        const orderPayload = {
            productName,
            quantity,
            price,
        };

        console.log('Order Payload:', orderPayload);
    }


    return (
        <Box maxWidth={400} mx="auto" mt={5}>
            <Typography variant="h5" gutterBottom>
                Create Order
            </Typography>
            <TextField fullWidth label="Product Name" margin="normal" value={productName} onChange={(e) => setProductName(e.target.value)} />
            <TextField fullWidth label="Quantity" margin="normal" type="number" value={quantity} onChange={(e) => setQuantity(Number(e.target.value))} />
            <TextField fullWidth label="Price" margin="normal" type="number" value={price} onChange={(e) => setPrice(Number(e.target.value))} />
            <Button variant="contained" color="primary" onClick={handleSubmit} sx={{ mt: 2 }}>Submit Order</Button>
        </Box>
    );
};

export default CreateOrderPage;